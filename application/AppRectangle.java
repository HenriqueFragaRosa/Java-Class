package application;

import java.util.Scanner;
import entities.Rectangle;

public class AppRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        scanner.close();
    }
}
