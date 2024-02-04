//This is the Triangle class that contains the height and base of the triangle and the method to calculate the area of the triangle.
package entities;

public class Triangle {
    public double height;
    public double base;

    public double area() {
        return (base * height) / 2;
    }

    public String toString() {
        return String.format("Area: %.2f", area());
    }

    public Double getHeight() {
        return height;
    }

    public Double getBase() {
        return base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
