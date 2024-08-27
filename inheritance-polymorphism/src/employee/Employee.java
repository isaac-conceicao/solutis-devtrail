package employee;

public class Employee {
    private String name;
    private String employeeCode;
    protected static final double BASE_INCOME = 1000.00;

    public Employee(String name, String employeeCode) {
        this.name = name;
        this.employeeCode = employeeCode;
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public double getIncome() {
        return BASE_INCOME;
    }

    @Override
    public String toString() {
        return "Funcionário: " + name + "\n Código: " + employeeCode + "\n Renda: R$" + getIncome();
    }

}