package employee.commission;

import employee.BasicEducationEmployee;
import employee.Employee;
import employee.GraduateEmployee;
import employee.HighSchoolEmployee;

public class CommissionTest {
    public static void main(String[] args) {
        final int COMPANY_SIZE = 10;
        Employee[] company = new Employee[COMPANY_SIZE];
        double totalCost, managersCost, supervisorsCost, sellersCost;

        totalCost = managersCost = supervisorsCost = sellersCost = 0.0;

        for(int i = 0; i < COMPANY_SIZE; i++ ){
            if (i < 1){
                company[i] = new Manager("Empregado " + i, "E00" + i);
            } else if (i < 3) {
                company[i] = new Supervisor("Empregado " + i, "E00" + i);
            } else {
                company[i] = new Seller("Empregado " + i, "E00" + i);
            }
        }

        for(Employee employee : company){
            double income = employee.getIncome();
            totalCost += income;

            if (employee.getClass() == Manager.class) {
                managersCost += income;
            } else if (employee.getClass() == Supervisor.class) {
                supervisorsCost += income;
            } else if (employee.getClass() == Seller.class) {
                sellersCost += income;
            }
        }

        System.out.println("[RELATÓRIO DE CUSTOS]");
        System.out.println("custo de gerentes: R$" + managersCost);
        System.out.println("custo de supervisores: R$" + supervisorsCost);
        System.out.println("custo de vendedores: R$" + sellersCost);
        System.out.println("custo total: " + totalCost);

        System.out.println("\n[FUNCIONÁRIOS]");

        for(Employee employee : company){
            System.out.println(employee.toString());
            System.out.println();
        }
    }



}