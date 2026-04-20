package geo;
public class ThreeDPoint extends Point {
 protected double z; 

  public ThreeDPoint(double x, double y, double z) {
 super(x, y); // Calls Point constructor
 this.z = z;
 }
 @Override
 public int getDimensionCount() {
 return 3;
 }
 @Override
 public String showPoint() {
 return "(" + this.x + ", " + this.y + ", " + this.z + ")";
 }
 // Note: distanceFromOrigin is inherited from Point but could be overridden for 3D logic
}