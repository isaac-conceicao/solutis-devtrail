package employee.commission;

import employee.Employee;

public class Supervisor extends Employee {
    private final double COMMISSION = 600.0;

    public Supervisor(String name, String employeeCode){
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
