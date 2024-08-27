package employee;

public class GraduateEmployee extends HighSchoolEmployee {
    private String university;

    public GraduateEmployee(String name, String employeeCode, String basicSchool, String highSchool, String university) {
        super(name, employeeCode, basicSchool, highSchool);
        this.university = university;
    }

    public GraduateEmployee(){
        super();
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public double getIncome() {
        return super.getIncome() * 2.00;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + university;
    }
}