public class Operator extends Employee{

    private double productionValue;
    private double commission;

    public Operator(String name,
                    String adress,
                    String phoneNumber,
                    int departmentCode,
                    double baseSalary,
                    double tax,
                    double productionValue,
                    double commission) {
        super(name, adress, phoneNumber, departmentCode, baseSalary, tax);
        this.productionValue = productionValue;
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
                        "\nvalor da produção: " + productionValue +
                        "\ncomissão: " + commission
                ;
    }

    public double getAdditional(){
        return productionValue * commission;
    }

    public double getProductionValue() {
        return productionValue;
    }

    public void setProductionValue(double productionValue) {
        this.productionValue = productionValue;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
