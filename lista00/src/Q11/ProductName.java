package Q11;

import java.util.Scanner;

public class ProductName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code;

        System.out.println("insira o código do produto: ");
        code = scanner.nextLine();

        switch (code) {
            case "001":
                System.out.println("Parafuso");
                break;
            case "002":
                System.out.println("Porca");
                break;
            case "003":
                System.out.println("Prego");
                break;
            default:
                System.out.println("Diversos");
                break;
        }

        scanner.close();
    }
}