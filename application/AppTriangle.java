// This is a static method that create two triangles and compare their areas.
package application;

import java.util.Scanner;
import entities.Triangle;

public class AppTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X : ");
        System.out.println("height : ");
        x.height = scanner.nextDouble();
        System.out.println("base : ");
        x.base = scanner.nextDouble();

        System.out.println("Now enter the measures of triangle Y : ");
        System.out.println("height : ");
        y.height = scanner.nextDouble();
        System.out.println("base : ");
        y.base = scanner.nextDouble();

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
