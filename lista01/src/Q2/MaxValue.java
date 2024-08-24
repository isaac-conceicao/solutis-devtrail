package Q2;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um valor: ");
        int m = scanner.nextInt();

        System.out.println("insira outro valor: ");
        int n = scanner.nextInt();

        System.out.println(
                m == n ? "os valores são iguais"
                : "o valor maior é: " + Math.max(m, n)
        );

        scanner.close();
    }
}
