package Q12;

import java.util.Scanner;

public class FuelEfficiencyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometersDriven, litersConsumed;
        float consumption;
        int tankCount = 0;
        int totalKilometers = 0;
        int totalLiters = 0;

        do {
            System.out.println("Tanque" + (tankCount+1) + ":");
            System.out.println("informe os kilometros dirigidos:");
            kilometersDriven = scanner.nextInt();
            System.out.println("informe os litros consumidos:");
            litersConsumed = scanner.nextInt();

            consumption = (float) kilometersDriven / litersConsumed;

            System.out.println("Tanque" + tankCount + ": " + consumption + " km/l");

            tankCount++;
            totalKilometers += kilometersDriven;
            totalLiters += litersConsumed;

        } while (menu(scanner));

        printSummary(totalKilometers,totalLiters);

        scanner.close();
    }

    private static void printSummary(int totalKilometers, int totalLiters){
        System.out.println("kilometragem combinada: " + totalKilometers);
        System.out.println("total de litros: " + totalLiters);
    }

    private static boolean menu(Scanner scan){
        System.out.println("reportar outro tanque? (Y/N)");
        char option = scan.next().toLowerCase().charAt(0);

        return option == 'y';
    }
}
