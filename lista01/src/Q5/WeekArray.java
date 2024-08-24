package Q5;

import java.util.Scanner;

public class WeekArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] days = {"segunda","terça","quarta","quinta","sexta","sábado","domingo"};
        int number;

        System.out.println("informe um número (de 1 a 7):");
        number = scanner.nextInt();

        System.out.println(
                (number < 1 || number > 7) ? "número inválido"
                : days[number-1]
        );

        scanner.close();
    }
}
