public class Counter {

    // static field – shared across ALL Counter objects
    private static int instanceCount = 0;

    // instance field – unique per object
    private int id;

    // Constructor
    public Counter() {
        instanceCount++;      // update shared counter
        this.id = instanceCount; // assign a unique id to this object
        System.out.println("Creating Counter object with id = " + id +
                           ", total objects so far = " + instanceCount);
    }

    // Instance method – needs an object
    public int getId() {
        return id;
    }

    // Static method – belongs to the class
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {

        // Before creating any objects
        System.out.println("Initial instanceCount = "
                           + Counter.getInstanceCount());  // 0

        System.out.println("---- Creating c1 ----");
        Counter c1 = new Counter();   // id = 1

        System.out.println("---- Creating c2 ----");
        Counter c2 = new Counter();   // id = 2

        System.out.println("---- Creating c3 ----");
        Counter c3 = new Counter();   // id = 3

        System.out.println("---- Checking ids ----");
        System.out.println("c1 id = " + c1.getId()); // 1
        System.out.println("c2 id = " + c2.getId()); // 2
        System.out.println("c3 id = " + c3.getId()); // 3

        System.out.println("---- Checking static count ----");
        System.out.println("Total Counter objects created = "
                           + Counter.getInstanceCount());  // 3
    }
}