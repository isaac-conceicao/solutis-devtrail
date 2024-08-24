package Q11;

import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1, word2;

        System.out.println("insira uma palavra:");
        word1 = scanner.nextLine().toLowerCase();

        System.out.println("insira uma palavra:");
        word2 = scanner.nextLine().toLowerCase();

        if (word1.compareTo(word2) == 0){
            System.out.println("palavras iguais");
        } else if (word1.compareTo(word2) < 0) {
            System.out.println("odem alfabética: " + word1 + ", " + word2);
        } else {
            System.out.println("odem alfabética: " + word2 + ", " + word1);
        }

        if (word1.length() == word2.length()){
            System.out.println("palavras do mesmo tamanho");
        } else if (word1.length() > word2.length()) {
            System.out.println("palavra mais longa: " + word1);
        } else {
            System.out.println("palavra mais longa: " + word2);
        }

        scanner.close();
    }
}
