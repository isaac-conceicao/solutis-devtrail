package employee.commission;

import employee.Employee;

public class Seller extends Employee {
    private final double COMMISSION = 250.0;

    public Seller(String name, String employeeCode){
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
