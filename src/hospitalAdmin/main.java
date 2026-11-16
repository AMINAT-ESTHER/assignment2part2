package hospitalAdmin;
 import hospitalRecords.patientRecords;
 import hospitalStaff.doctor;
 import hospitalStaff.receptionist;
public class main {
    public static void main(String[] args) {
       patientRecords patient1 = new patientRecords("p213", "willy", "malaria", "23/jan/2026");

       receptionist receptionist = new receptionist();
       receptionist.viewBasicInfo(patient1);

       doctor doctor = new doctor();
       doctor.treatPatient(patient1);

       financialRecord financialRecord = new financialRecord(70000, 50000);
        System.out.println("balance due "+ financialRecord.getBalanceDue());
        System.out.println("amount paid " + financialRecord.getAmountPaid());
    }
}
