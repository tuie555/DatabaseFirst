import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String csvFilePath = "2024 QS World University Rankings 1.1 (For qs.com).csv"; 
        List<Unidata> dataList = new ArrayList<>();
        Scanner sc = new Scanner(new File(csvFilePath), "UTF-8"); // Use UTF-8 encoding to handle special characters
// Skip the header line
if (sc.hasNextLine()) sc.nextLine();
if (sc.hasNextLine()) sc.nextLine();
while (sc.hasNextLine()) {
    String line = sc.nextLine().trim();
    if (line.isEmpty()) continue;

    String[] t = line.split(",", -1); // -1 for keeping trailing empty strings

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
    } catch (Exception e) {
        System.out.println("Parse error: " + Arrays.toString(t));
    }
    
}
// Add Chiang Mai University data to line 1500
dataList.add(1497, new Unidata(
            safeParseInt("=571"),
            safeParseInt("601-650"),
            "Chiang Mai University",
            "TH","Thailand",
            "XL","FC",
            "HI",60,"Public research university",
            safeParseFloat("33.8"),
            256,
            safeParseFloat("19.3"),
            466,
            safeParseFloat("16.4"),
            safeParseInt("701+"),
            safeParseFloat("3.9"),
            safeParseInt("701+"),
            safeParseFloat("5.1"),
            safeParseInt("701+"),
            safeParseFloat("4.1"),
            safeParseInt("701+"),
            safeParseFloat("20.9"),
            538,
            safeParseFloat("17.1"),
            495,
            safeParseFloat("59.2"),
            safeParseInt("=357"),
            safeParseFloat("30.9")
        ));
        // Write the data to a CSV file
        WriteToFile(dataList, "QS_World University Ranking 2024.csv");
sc.close();
    }
    // Helper methods to parse integers and floats safely
    private static int safeParseInt(String s) {
        if (s == null || s.trim().isEmpty()) return -1;
        try {
            return Integer.parseInt(s.replaceAll("[^\\d]", "").trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    private static float safeParseFloat(String s) {
        if (s == null || s.trim().isEmpty()) return 0f;
        try {
            return Float.parseFloat(s.replaceAll("[^\\d]", "").trim());
        } catch (NumberFormatException e) {
            return 0f;
        }
    }
    // Method to write the data to a CSV file
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
            writer.write("rank display,rank display2,institution,location code,location,size,focus,research,age band,status,ar score,ar rank,er score,er rank,fsr score,fsr rank,cpf score,cpf rank,ifr score,ifr rank,isr score,isr rank,irn score,irn rank,ger score,ger rank,SUS SCORE,SUS RANK,Overall Score");
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

    // Part 1
    // 1) What are the metadata for the given data? (1 point)
    // The metadata fields for the dataset are:
    // 2024 RANK
    // 2023 RANK
    // Institution Name
    // Country Code
    // Country
    // SIZE
    // FOCUS
    // RES.
    // AGE
    // STATUS
    // Academic Reputation Score
    // Academic Reputation Rank
    // Employer Reputation Score
    // Employer Reputation Rank
    // Faculty Student Score
    // Faculty Student Rank
    // Citations per Faculty Score
    // Citations per Faculty Rank
    // International Faculty Score
    // International Faculty Rank
    // International Students Score
    // International Students Rank
    // International Research Network Score
    // International Research Network Rank
    // Employment Outcomes Score
    // Employment Outcomes Rank
    // Sustainability Score
    // Sustainability Rank
    // Overall SCORE


    // Part2) List all the data types of each attribute. (1 point)
    // 2024 RANK	Integer
    // 2023 RANK	Integer
    // Institution Name	String
    // Country Code	String
    // Country	String
    // SIZE	String
    // FOCUS	String
    // RES.	String
    // AGE	Integer
    // STATUS	String
    // Academic Reputation Score	Float
    // Academic Reputation Rank	Integer
    // Employer Reputation Score	Float
    // Employer Reputation Rank	Integer
    // Faculty Student Score	Float
    // Faculty Student Rank	Integer
    // Citations per Faculty Score	Float
    // Citations per Faculty Rank	Integer
    // International Faculty Score	Float
    // International Faculty Rank	Integer
    // International Students Score	Float
    // International Students Rank	Integer
    // International Research Network Score	Float
    // International Research Network Rank	Integer
    // Employment Outcomes Score	Float
    // Employment Outcomes Rank	Integer
    // Sustainability Score	Float
    // Sustainability Rank	Integer
    // Overall SCORE	Float

    // Part 3)[Extra credit ] What problem have you found when you are dealing with the tradition database files? Explain in detail?(2 points)
    // when ReadFile somelines and some colums are empty so i have to use trim() to remove the empty space.
    // and some line have special characters include with interger or float like 12.3= or 154+ so i have to use replaceAll("[^\\d]", "") to remove the special characters