import javax.swing.*;
import java.text.*;

// 1. Define the Shape interface
interface Shape {
    String getName();

    double getArea();

    double getVolume();
}

// 2. Point class implements Shape
class Point implements Shape {
    private int x;
    private int y;

    public Point(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getVolume() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }
}

// 3. Circle4 extends Point and implements Shape
class Circle4 extends Point {
    private double radius;

    public Circle4(int xValue, int yValue, double rValue) {
        super(xValue, yValue);
        radius = (rValue < 0.0 ? 0.0 : rValue);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Center = " + super.toString() + "; Radius = " + getRadius();
    }
}

// 4. Cylinder extends Circle4
class Cylinder extends Circle4 {
    private double height;

    public Cylinder(int xValue, int yValue, double rValue, double hValue) {
        super(xValue, yValue, rValue);
        height = (hValue < 0.0 ? 0.0 : hValue);
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
    }

    @Override
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + "; Height = " + getHeight();
    }
}

// 5. Main class
public class InterfaceTest {
    public static void main(String args[]) {
        DecimalFormat twoDigits = new DecimalFormat("0.00");

        Point point = new Point(7, 11);
        Circle4 circle = new Circle4(22, 8, 3.5);
        Cylinder cylinder = new Cylinder(20, 30, 3.3, 10.75); // Fixed 3.3.3 typo

        String output = point.getName() + ": " + point + "\n" +
                circle.getName() + ": " + circle + "\n" +
                cylinder.getName() + ": " + cylinder + "\n";

        Shape arrayOfShapes[] = new Shape[3]; // Fixed missing [3] array sizing

        arrayOfShapes[0] = point; // Fixed singular 'arrayOfShape' typo
        arrayOfShapes[1] = circle;
        arrayOfShapes[2] = cylinder;

        for (int i = 0; i < arrayOfShapes.length; i++) {
            output += "\n\n" + arrayOfShapes[i].getName() + ": " +
                    arrayOfShapes[i].toString() + "\nArea = " +
                    twoDigits.format(arrayOfShapes[i].getArea()) + "\nVolume = " +
                    twoDigits.format(arrayOfShapes[i].getVolume());
        }

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}
