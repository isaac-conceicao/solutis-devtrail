package employee.commission;

import employee.Employee;

public class Manager extends Employee {
    private final double COMMISSION = 1500.0;

    public Manager(String name, String employeeCode){
        super(name,employeeCode);
    }

    @Override
    public double getIncome() {
        return super.getIncome() + COMMISSION;
    }

    @Override
    public String toString() {
        return "Funcionário: " + getName() + "\nComissão: " + COMMISSION + "\nSalário total: R$" + getIncome();
    }
}
