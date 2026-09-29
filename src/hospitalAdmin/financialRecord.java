package hospitalAdmin;

public class financialRecord {
    private double balanceDue;
    private double amountPaid;

    public financialRecord(double balanceDue, double amountPaid){
        this.balanceDue = balanceDue;
        this.amountPaid = amountPaid;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}
