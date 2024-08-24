package Q8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        int length;
        boolean palindrome = true;

        System.out.println("informe uma palavra:");
        word = scanner.nextLine();

        length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)){
                palindrome = false;
            }
        }

        if (palindrome) System.out.println("uma mensagem");
        
        scanner.close();
    }
}
