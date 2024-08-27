package employee;

public class HighSchoolEmployee extends BasicEducationEmployee {
    private String highSchool;

    public HighSchoolEmployee(String name, String employeeCode, String basicSchool, String highSchool) {
        super(name, employeeCode, basicSchool);
        this.highSchool = highSchool;
    }

    public HighSchoolEmployee(){
        super();
    }

    public String getHighSchool() {
        return highSchool;
    }

    @Override
    public double getIncome() {
        return super.getIncome() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Ensino Médio: " + highSchool;
    }
}