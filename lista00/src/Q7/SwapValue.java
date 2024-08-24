package Q7;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um valor: ");
        a = scanner.nextInt();

        System.out.println("insira outro valor: ");
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("valores trocados: " + a + ", " + b);

        scanner.close();
    }
}