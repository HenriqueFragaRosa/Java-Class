package application;

import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X : ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Now enter the measures of triangle Y : ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        System.out.println(x.toString());
        System.out.println(y.toString());
        if (x.area() > y.area()){
            System.out.println("Larger area: X");
        } else if (y.area() > x.area()){
            System.out.println("Larger area: Y");
        } else {
            System.out.println("The areas are equal");
        }
        scanner.close();
    }    
}
