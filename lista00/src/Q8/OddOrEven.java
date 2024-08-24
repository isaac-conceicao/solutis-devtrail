package Q8;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um inteiro: ");
        int n = scanner.nextInt();

        System.out.println(
                (n % 2 == 0) ? n + " é par"
                : n + " é ímpar"
        );

        scanner.close();
    }
}