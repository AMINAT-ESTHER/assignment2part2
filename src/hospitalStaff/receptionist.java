package hospitalStaff;
import hospitalRecords.patientRecords;
public class receptionist {
    public void viewBasicInfo (patientRecords patient){
        System.out.println("patient name" + patient.name);
        patient.basicDetails();
    }
}
