package Q6;

import java.awt.*;
import java.util.Scanner;

public class OddsProduct {
    public static void main(String[] args) {
        int product = 15;

        for(int i = 17; i <= 30; i += 2){
            System.out.println(product);
            product *= i;
        }

        System.out.println(product);
    }
}
