import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        String csvFilePath = "2024 QS World University Rankings 1.1 (For qs.com).csv"; // ชื่อไฟล์ CSV ของคุณ
        List<Unidata> dataList = new ArrayList<>();

        Scanner sc = new Scanner(new File(csvFilePath), "UTF-8");
// ข้าม 2 HEADER
if (sc.hasNextLine()) sc.nextLine(); // ข้ามบรรทัดแรก
if (sc.hasNextLine()) sc.nextLine(); // ข้ามบรรทัดที่ 2

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
            t[0].trim().isEmpty() ? -1 : Integer.parseInt(t[0].replace("=", "").replaceAll("[^\\d]", "")),
            t[1].trim().isEmpty() ? -1 : Integer.parseInt(t[1].replace("=", "").replaceAll("[^\\d]", "")),
            t[2].trim(),
            t[3].trim(),
            t[4].trim(),
            t[5].trim(),
            t[6].trim(),
            t[7].trim(),
            t[8].trim().isEmpty() ? -1 : Integer.parseInt(t[8].replace("=", "").replaceAll("[^\\d]", "")),
            t[9].trim(),
            t[10].trim().isEmpty() ? 0 : Float.parseFloat(t[10].trim()),
            t[11].trim().isEmpty() ? -1 : Integer.parseInt(t[11].replace("=", "").replaceAll("[^\\d]", "")),
            t[12].trim().isEmpty() ? 0 : Float.parseFloat(t[12].trim()),
            t[13].trim().isEmpty() ? -1 : Integer.parseInt(t[13].replace("=", "").replaceAll("[^\\d]", "")),
            t[14].trim().isEmpty() ? 0 : Float.parseFloat(t[14].trim()),
            t[15].trim().isEmpty() ? -1 : Integer.parseInt(t[15].replace("=", "").replaceAll("[^\\d]", "")),
            t[16].trim().isEmpty() ? 0 : Float.parseFloat(t[16].trim()),
            t[17].trim().isEmpty() ? -1 : Integer.parseInt(t[17].replace("=", "").replaceAll("[^\\d]", "")),
            t[18].trim().isEmpty() ? 0 : Float.parseFloat(t[18].trim()),
            t[19].trim().isEmpty() ? -1 : Integer.parseInt(t[19].replace("=", "").replaceAll("[^\\d]", "")),
            t[20].trim().isEmpty() ? 0 : Float.parseFloat(t[20].trim()),
            t[21].trim().isEmpty() ? -1 : Integer.parseInt(t[21].replace("=", "").replaceAll("[^\\d]", "")),
            t[22].trim().isEmpty() ? 0 : Float.parseFloat(t[22].trim()),
            t[23].trim().isEmpty() ? -1 : Integer.parseInt(t[23].replace("=", "").replaceAll("[^\\d]", "")),
            t[24].trim().isEmpty() ? 0 : Float.parseFloat(t[24].trim()),
            t[25].trim().isEmpty() ? -1 : Integer.parseInt(t[25].replace("=", "").replaceAll("[^\\d]", "")),
            t[26].trim().isEmpty() ? 0 : Float.parseFloat(t[26].trim()),
            t[27].trim().isEmpty() ? -1 : Integer.parseInt(t[27].replace("=", "").replaceAll("[^\\d]", "")),
            t[28].trim().isEmpty() ? 0 : Float.parseFloat(t[28].trim())
        );
        dataList.add(data);
    } catch (Exception e) {
        System.out.println("Parse error: " + Arrays.toString(t));
    }
}
sc.close();

        // ทดสอบแสดงชื่อมหาวิทยาลัยทั้งหมด
        for (Unidata uni : dataList) {
            System.out.println(uni.getInstitutionName());
        }
    }
}