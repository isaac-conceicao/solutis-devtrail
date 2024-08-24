package Q9;

import java.util.Scanner;

public class CirclesArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area,radius;

        System.out.println("informe o raio (cm):");
        radius = scanner.nextDouble();

        area = Math.PI * Math.pow(radius,2);

        System.out.println("área: "+ Math.round(area) +"cm²");

        scanner.close();
    }
}
