import java.util.Arrays;
import java.util.List;

public class Unidata {
private int rank2024;
private int rank2023;
private String institutionName;
private String countryCode;
private String country;
private String size;
private String focus;
private String researchLevel;
private int age;
private String status;
private float academicReputationScore;
private int academicReputationRank;
private float employerReputationScore;
private int employerReputationRank;
private float facultyStudentScore;
private int facultyStudentRank;
private float citationsPerFacultyScore;
private int citationsPerFacultyRank;
private float internationalFacultyScore;
private int internationalFacultyRank;
private float internationalStudentsScore;
private int internationalStudentsRank;
private float internationalResearchNetworkScore;
private int internationalResearchNetworkRank;
private float employmentOutcomesScore;
private int employmentOutcomesRank;
private float sustainabilityScore;
private int sustainabilityRank;
private float overallScore;
public Unidata(int rank2024, int rank2023, String institutionName, String countryCode, String country, String size,
        String focus, String researchLevel, int age, String status, float academicReputationScore,
        int academicReputationRank, float employerReputationScore, int employerReputationRank,
        float facultyStudentScore, int facultyStudentRank, float citationsPerFacultyScore, int citationsPerFacultyRank,
        float internationalFacultyScore, int internationalFacultyRank, float internationalStudentsScore,
        int internationalStudentsRank, float internationalResearchNetworkScore, int internationalResearchNetworkRank,
        float employmentOutcomesScore, int employmentOutcomesRank, float sustainabilityScore, int sustainabilityRank,
        float overallScore) {
    this.rank2024 = rank2024;
    this.rank2023 = rank2023;
    this.institutionName = institutionName;
    this.countryCode = countryCode;
    this.country = country;
    this.size = size;
    this.focus = focus;
    this.researchLevel = researchLevel;
    this.age = age;
    this.status = status;
    this.academicReputationScore = academicReputationScore;
    this.academicReputationRank = academicReputationRank;
    this.employerReputationScore = employerReputationScore;
    this.employerReputationRank = employerReputationRank;
    this.facultyStudentScore = facultyStudentScore;
    this.facultyStudentRank = facultyStudentRank;
    this.citationsPerFacultyScore = citationsPerFacultyScore;
    this.citationsPerFacultyRank = citationsPerFacultyRank;
    this.internationalFacultyScore = internationalFacultyScore;
    this.internationalFacultyRank = internationalFacultyRank;
    this.internationalStudentsScore = internationalStudentsScore;
    this.internationalStudentsRank = internationalStudentsRank;
    this.internationalResearchNetworkScore = internationalResearchNetworkScore;
    this.internationalResearchNetworkRank = internationalResearchNetworkRank;
    this.employmentOutcomesScore = employmentOutcomesScore;
    this.employmentOutcomesRank = employmentOutcomesRank;
    this.sustainabilityScore = sustainabilityScore;
    this.sustainabilityRank = sustainabilityRank;
    this.overallScore = overallScore;
}
//// Returns a list of all fields in the object, quoted for CSV compatibility
public List<String> getAllFieldsQuoted() {
    return Arrays.asList(
        quote(String.valueOf(rank2024)),
        quote(String.valueOf(rank2023)),
        quote(institutionName),
        quote(countryCode),
        quote(country),
        quote(size),
        quote(focus),
        quote(researchLevel),
        quote(String.valueOf(age)),
        quote(status),
        quote(String.valueOf(academicReputationScore)),
        quote(String.valueOf(academicReputationRank)),
        quote(String.valueOf(employerReputationScore)),
        quote(String.valueOf(employerReputationRank)),
        quote(String.valueOf(facultyStudentScore)),
        quote(String.valueOf(facultyStudentRank)),
        quote(String.valueOf(citationsPerFacultyScore)),
        quote(String.valueOf(citationsPerFacultyRank)),
        quote(String.valueOf(internationalFacultyScore)),
        quote(String.valueOf(internationalFacultyRank)),
        quote(String.valueOf(internationalStudentsScore)),
        quote(String.valueOf(internationalStudentsRank)),
        quote(String.valueOf(internationalResearchNetworkScore)),
        quote(String.valueOf(internationalResearchNetworkRank)),
        quote(String.valueOf(employmentOutcomesScore)),
        quote(String.valueOf(employmentOutcomesRank)),
        quote(String.valueOf(sustainabilityScore)),
        quote(String.valueOf(sustainabilityRank)),
        quote(String.valueOf(overallScore))
    );
}

private static String quote(String text) {
    if (text.contains(",") || text.contains("\"")) {
        return "\"" + text.replace("\"", "\"\"") + "\"";
    }
    return text;
}

}