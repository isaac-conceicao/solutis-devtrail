package Q10;

import java.util.Locale;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int whitespaces = 0;
        int vowels = 0;
        int consonants = 0;
        String str;

        System.out.println("insira uma string:");
        str = scanner.nextLine().toLowerCase();

        for (char ch: str.toCharArray()){
            if (Character.isWhitespace(ch)) whitespaces++;
            else if (isVowel(ch)) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }

        System.out.println("vogais: " + vowels);
        System.out.println("consoantes: " + consonants);
        System.out.println("espaços em branco: " + whitespaces);

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
