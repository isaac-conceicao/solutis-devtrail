package employee;

public class BasicEducationEmployee extends Employee {
    private String school;

    public BasicEducationEmployee(String name, String employeeCode, String school) {
        super(name, employeeCode);
        this.school = school;
    }

    public BasicEducationEmployee() {
        super();
    }

    public String getSchool() {
        return school;
    }

    @Override
    public double getIncome() {
        return super.getIncome() * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola de Ensino Básico: " + school;
    }
}
