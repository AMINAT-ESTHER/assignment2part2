package hospitalStaff;
import hospitalRecords.patientRecords;
public class doctor {
    String doctorName = "JOHN";
    String doctorId = "D123";
    public void treatPatient(patientRecords patient){
        System.out.println("  DOCTOR VIEW");
        System.out.println("patient name: " + patient.name);
        System.out.println("Doctor:" + doctorName +" Id " + doctorId + " is viewing medical history of " + patient.medicalHistory);
        String history = patient.medicalHistory;
    }

}
