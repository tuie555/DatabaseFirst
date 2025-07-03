import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        String csvFilePath = "2024 QS World University Rankings 1.1 (For qs.com).csv";
        List<Unidata> dataList = new ArrayList<>();

        Scanner sc = new Scanner(new File(csvFilePath), "UTF-8");

if (sc.hasNextLine()) sc.nextLine();
if (sc.hasNextLine()) sc.nextLine();
while (sc.hasNextLine()) {
    String line = sc.nextLine().trim();
    if (line.isEmpty()) continue;

    String[] t = line.split(",", -1); // -1 เพื่อไม่ทิ้งช่องว่างท้าย

    if (t.length < 29) {
        System.out.println("Short line: " + Arrays.toString(t));
        continue;
    }

    try {
        Unidata data = new Unidata(
                    safeParseInt(t[0]),
                    safeParseInt(t[1]),
                    t[2].trim(),
                    t[3].trim(),
                    t[4].trim(),
                    t[5].trim(),
                    t[6].trim(),
                    t[7].trim(),
                    safeParseInt(t[8]),
                    t[9].trim(),
                    safeParseFloat(t[10]),
                    safeParseInt(t[11]),
                    safeParseFloat(t[12]),
                    safeParseInt(t[13]),
                    safeParseFloat(t[14]),
                    safeParseInt(t[15]),
                    safeParseFloat(t[16]),
                    safeParseInt(t[17]),
                    safeParseFloat(t[18]),
                    safeParseInt(t[19]),
                    safeParseFloat(t[20]),
                    safeParseInt(t[21]),
                    safeParseFloat(t[22]),
                    safeParseInt(t[23]),
                    safeParseFloat(t[24]),
                    safeParseInt(t[25]),
                    safeParseFloat(t[26]),
                    safeParseInt(t[27]),
                    safeParseFloat(t[28])
        );
        
        dataList.add(data);
        for (int i = 0; i < dataList.size(); i++) {
    Unidata uni = dataList.get(i);
    
    if (uni.getInstitutionName().equalsIgnoreCase("Chiang Mai University")) {
        uni.setSustainabilityRank(357);
        
        break;
    }
    
}
WriteToFile(dataList, "QS_World University Ranking 2024.csv");

    } catch (Exception e) {
        System.out.println("Parse error: " + Arrays.toString(t));
    }
    
}
sc.close();
long end = System.currentTimeMillis();
    System.out.println("Time taken: " + (end - start) + " s");
    }
    private static int safeParseInt(String s) {
        if (s == null || s.trim().isEmpty()) return -1;
        try {
            return Integer.parseInt(s.replace("=", "").replace("+", "").replace("-", "").replaceAll("[^\\d]", "").trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    private static float safeParseFloat(String s) {
        if (s == null || s.trim().isEmpty()) return 0f;
        try {
            return Float.parseFloat(s.replace("=", "").replace("+", "").replace("-", "").trim());
        } catch (NumberFormatException e) {
            return 0f;
        }
    }
    private static void WriteToFile(List<Unidata> dataList, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("rank2024,rank2023,institutionName,countryCode,country,size,focus,researchLevel,age,status,"
                + "academicReputationScore,academicReputationRank,"
                + "employerReputationScore,employerReputationRank,"
                + "facultyStudentScore,facultyStudentRank,"
                + "citationsPerFacultyScore,citationsPerFacultyRank,"
                + "internationalFacultyScore,internationalFacultyRank,"
                + "internationalStudentsScore,internationalStudentsRank,"
                + "internationalResearchNetworkScore,internationalResearchNetworkRank,"
                + "employmentOutcomesScore,employmentOutcomesRank,"
                + "sustainabilityScore,sustainabilityRank,overallScore");
            writer.newLine();
            for (Unidata uni : dataList) {
                String line = String.join(",", uni.getAllFieldsQuoted());
                writer.write(line);
                writer.newLine();
                
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
}