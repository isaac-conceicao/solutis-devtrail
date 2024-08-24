package Q4;

import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mi, km;

        System.out.println("informe a distância em milhas:");
        mi = scanner.nextDouble();

        km = mi * 1.609;

        System.out.println("resultado: " + km + "km");

        scanner.close();
    }
}
