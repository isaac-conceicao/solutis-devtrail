package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        final int COMPANY_SIZE = 10;
        Employee[] company = new Employee[COMPANY_SIZE];
        double totalCost, basicEducationCost, highSchoolCost, graduateCost;

        totalCost = basicEducationCost = highSchoolCost = graduateCost = 0.0;

        for(int i = 0; i < COMPANY_SIZE; i++ ){
            if (i < 4){
                company[i] = new BasicEducationEmployee();
            } else if (i < 8) {
                company[i] = new HighSchoolEmployee();
            } else {
                company[i] = new GraduateEmployee();
            }
        }

        for(Employee employee : company){
            double income = employee.getIncome();
            totalCost += income;

            if (employee.getClass() == BasicEducationEmployee.class) {
                basicEducationCost += income;
            } else if (employee.getClass() == HighSchoolEmployee.class) {
                highSchoolCost += income;
            } else if (employee.getClass() == GraduateEmployee.class) {
                graduateCost += income;
            }
        }

        System.out.println("custo de nível básico: R$" + basicEducationCost);
        System.out.println("custo de nível médio: R$" + highSchoolCost);
        System.out.println("custo de nível superior: R$" + graduateCost);
        System.out.println("custo total: " + totalCost);
    }



}