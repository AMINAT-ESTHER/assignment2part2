package hospitalStaff;
import hospitalRecords.patientRecords;
public class doctor {
    String doctorName;
    String doctorId;
    public void treatPatient(patientRecords patient, String currentDiagnosis){
        System.out.println("Doctor" + doctorName +"Id" + doctorId + "is viewing medical history:" + patient.medicalHistory);
        patient.medicalHistory = currentDiagnosis;
    }

}
