package hospitalRecords;

public class patientRecords {
    public String name;
    public String appointmentDate;
    String medicalHistory;
    String currentDiagnosis;
    private int age;
    private String patientId;

    public patientRecords(String patientId, String name,int age, String appointmentDate){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.appointmentDate = appointmentDate;
    }

    public String getPatientId() {
        return patientId;
    }

    public int getAge() {
        return age;
    }
}
