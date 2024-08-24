package Q3;

import java.util.Scanner;

public class PrimePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <= 2){
            System.out.println("não há primos menores que " + n);
        } else {
            System.out.println("primos menores que "+ n +":");
            for(int i = 2; i < n; i++){
                if (isPrime(i)){
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }

    private static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }
}
