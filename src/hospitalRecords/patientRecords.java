package hospitalRecords;

public class patientRecords {
    public String name;
    public String appointmentDate;
    public String medicalHistory;

    private int age;
    private String patientId;

    public patientRecords(String patientId, String name,String medicalHistory, String appointmentDate){
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.appointmentDate = appointmentDate;
    }
    public void basicDetails(){
        System.out.println("   Receptionist view");
        System.out.println("patient:" + name);
        System.out.println("appointment date:" +appointmentDate);
    }

}
