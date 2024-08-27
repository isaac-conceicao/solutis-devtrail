public class Employee extends Person{
    private int departmentCode;
    private double baseSalary;
    private double tax;

    public Employee(){
        super();
    }

    public Employee(String name, String adress, String phoneNumber, int departmentCode, double baseSalary, double tax) {
        super(name, adress, phoneNumber);
        this.departmentCode = departmentCode;
        this.baseSalary = baseSalary;
        this.tax = tax;
    }

    public double calculateSalary(){
        return baseSalary - (baseSalary * tax);
    }
    public String toString(double additional) {
        return
                super.toString() +
                "\ncódigo do setor: " + departmentCode +
                "\nsalário base: " + baseSalary +
                "\nimposto: " + tax +
                "\nsalário: " + (this.calculateSalary() + additional)
        ;
    }

    @Override
    public String toString(){
        return toString(0.0);
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
