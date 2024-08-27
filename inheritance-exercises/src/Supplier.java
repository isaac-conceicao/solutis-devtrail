public class Supplier extends Person{

    private double creditValue;
    private double debtValue;

    public Supplier(){
        super();
    }

    public Supplier(String name, String adress, String phoneNumber, double creditValue, double debtValue) {
        super(name, adress, phoneNumber);
        this.creditValue = creditValue;
        this.debtValue = debtValue;
    }

    public double getBalance(){
        return creditValue - debtValue;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\ncrédito: " + creditValue +
                "\ndébito: " + debtValue +
                "\nsaldo: " + getBalance()
        ;
    }

    public double getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(double creditValue) {
        this.creditValue = creditValue;
    }

    public double getDebtValue() {
        return debtValue;
    }

    public void setDebtValue(double debtValue) {
        this.debtValue = debtValue;
    }
}
