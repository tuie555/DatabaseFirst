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
public int getRank2024() {
    return rank2024;
}
public void setRank2024(int rank2024) {
    this.rank2024 = rank2024;
}
public int getRank2023() {
    return rank2023;
}
public void setRank2023(int rank2023) {
    this.rank2023 = rank2023;
}
public String getInstitutionName() {
    return institutionName;
}
public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
}
public String getCountryCode() {
    return countryCode;
}
public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
}
public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}
public String getSize() {
    return size;
}
public void setSize(String size) {
    this.size = size;
}
public String getFocus() {
    return focus;
}
public void setFocus(String focus) {
    this.focus = focus;
}
public String getResearchLevel() {
    return researchLevel;
}
public void setResearchLevel(String researchLevel) {
    this.researchLevel = researchLevel;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public float getAcademicReputationScore() {
    return academicReputationScore;
}
public void setAcademicReputationScore(float academicReputationScore) {
    this.academicReputationScore = academicReputationScore;
}
public int getAcademicReputationRank() {
    return academicReputationRank;
}
public void setAcademicReputationRank(int academicReputationRank) {
    this.academicReputationRank = academicReputationRank;
}
public float getEmployerReputationScore() {
    return employerReputationScore;
}
public void setEmployerReputationScore(float employerReputationScore) {
    this.employerReputationScore = employerReputationScore;
}
public int getEmployerReputationRank() {
    return employerReputationRank;
}
public void setEmployerReputationRank(int employerReputationRank) {
    this.employerReputationRank = employerReputationRank;
}
public float getFacultyStudentScore() {
    return facultyStudentScore;
}
public void setFacultyStudentScore(float facultyStudentScore) {
    this.facultyStudentScore = facultyStudentScore;
}
public int getFacultyStudentRank() {
    return facultyStudentRank;
}
public void setFacultyStudentRank(int facultyStudentRank) {
    this.facultyStudentRank = facultyStudentRank;
}
public float getCitationsPerFacultyScore() {
    return citationsPerFacultyScore;
}
public void setCitationsPerFacultyScore(float citationsPerFacultyScore) {
    this.citationsPerFacultyScore = citationsPerFacultyScore;
}
public int getCitationsPerFacultyRank() {
    return citationsPerFacultyRank;
}
public void setCitationsPerFacultyRank(int citationsPerFacultyRank) {
    this.citationsPerFacultyRank = citationsPerFacultyRank;
}
public float getInternationalFacultyScore() {
    return internationalFacultyScore;
}
public void setInternationalFacultyScore(float internationalFacultyScore) {
    this.internationalFacultyScore = internationalFacultyScore;
}
public int getInternationalFacultyRank() {
    return internationalFacultyRank;
}
public void setInternationalFacultyRank(int internationalFacultyRank) {
    this.internationalFacultyRank = internationalFacultyRank;
}
public float getInternationalStudentsScore() {
    return internationalStudentsScore;
}
public void setInternationalStudentsScore(float internationalStudentsScore) {
    this.internationalStudentsScore = internationalStudentsScore;
}
public int getInternationalStudentsRank() {
    return internationalStudentsRank;
}
public void setInternationalStudentsRank(int internationalStudentsRank) {
    this.internationalStudentsRank = internationalStudentsRank;
}
public float getInternationalResearchNetworkScore() {
    return internationalResearchNetworkScore;
}
public void setInternationalResearchNetworkScore(float internationalResearchNetworkScore) {
    this.internationalResearchNetworkScore = internationalResearchNetworkScore;
}
public int getInternationalResearchNetworkRank() {
    return internationalResearchNetworkRank;
}
public void setInternationalResearchNetworkRank(int internationalResearchNetworkRank) {
    this.internationalResearchNetworkRank = internationalResearchNetworkRank;
}
public float getEmploymentOutcomesScore() {
    return employmentOutcomesScore;
}
public void setEmploymentOutcomesScore(float employmentOutcomesScore) {
    this.employmentOutcomesScore = employmentOutcomesScore;
}
public int getEmploymentOutcomesRank() {
    return employmentOutcomesRank;
}
public void setEmploymentOutcomesRank(int employmentOutcomesRank) {
    this.employmentOutcomesRank = employmentOutcomesRank;
}
public float getSustainabilityScore() {
    return sustainabilityScore;
}
public void setSustainabilityScore(float sustainabilityScore) {
    this.sustainabilityScore = sustainabilityScore;
}
public int getSustainabilityRank() {
    return sustainabilityRank;
}
public void setSustainabilityRank(int sustainabilityRank) {
    this.sustainabilityRank = sustainabilityRank;
}
public float getOverallScore() {
    return overallScore;
}
public void setOverallScore(float overallScore) {
    this.overallScore = overallScore;
}
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