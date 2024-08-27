public class Seller extends Employee{

    private double salesValue;
    private double commission;

    public Seller(String name,
                    String address,
                    String phoneNumber,
                    int departmentCode,
                    double baseSalary,
                    double tax,
                    double salesValue,
                    double commission) {
        super(name, address, phoneNumber, departmentCode, baseSalary, tax);
        this.salesValue = salesValue;
        this.commission = commission;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + getAdditional();
    }

    @Override
    public String toString() {
        return
                super.toString(getAdditional()) +
                        "\nvalor de vendas: " + salesValue +
                        "\ncomissão: " + commission
                ;
    }

    public double getAdditional(){
        return salesValue * commission;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
