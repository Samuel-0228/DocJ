package geo;
public class Point extends AbstractPoint {
 public Point(double x, double y) {
 super(x, y);
 }
 @Override
 public int getDimensionCount() {
 return 2;
 }
 @Override
 public String showPoint() {
 return "(" + this.x + ", " + this.y + ")";
 }
 @Override
 public double distanceFromOrigin() {
 return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
 }
} 
