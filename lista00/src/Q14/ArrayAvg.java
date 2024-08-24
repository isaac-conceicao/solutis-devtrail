package Q14;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 50;
        int[] ar = new int[ARRAY_SIZE];
        double avg = 0.0;

        int i = 0;
        
        while (i < ARRAY_SIZE) {
            System.out.println("informe o "+ (i+1) + "º número:");
            ar[i] =  scanner.nextInt();
            i++;
        }

        avg = Arrays.stream(ar)
                    .average()
                    .orElse(0.0);

        System.out.println("média aritmética: "+ avg);
    }
}
