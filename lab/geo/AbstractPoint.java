package geo;
public abstract class AbstractPoint implements Measurable {
 protected double x; // Protected for inheritance
 protected double y;
 public AbstractPoint(double x, double y) {
 this.x = x;
 this.y = y;
 }
 // Abstract Method: Forces concrete classes to define their dimensions
 abstract public int getDimensionCount();
}