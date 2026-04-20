package geo;
public class Geo {
 public static void main(String[] args) {
 // Polymorphism: Using the specific types
 Point p = new Point(3, 4);
 System.out.println("2D Point: " + p.showPoint());
 System.out.println("Distance: " + p.distanceFromOrigin());
 ThreeDPoint tdp = new ThreeDPoint(1, 2, 2);


 System.out.println("3D Point: " + tdp.showPoint());
 System.out.println("Dimensions: " + tdp.getDimensionCount());
 // Polymorphism: Using Interface references
 Measurable[] shapes = {p, tdp};
 for (Measurable m : shapes) {
 System.out.println("Display: " + m.showPoint());
 }
 }
} 
