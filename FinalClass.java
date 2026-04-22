// 1) FINAL CLASS: cannot be extended
final class FinalClass {
    // 2) FINAL VARIABLE (instance-level constant)
    final int CONSTANT_VALUE = 10;

    // 3) FINAL METHOD: cannot be overridden
    final void showConstant() {
        System.out.println("CONSTANT_VALUE = " + CONSTANT_VALUE);
    }
}

// Trying to extend FinalClass would cause a COMPILE ERROR:
// class ChildClass extends FinalClass { }  // ❌ Not allowed


// A normal class to show final variables and methods in action
class DemoFinal {

    // 4) FINAL STATIC VARIABLE: class-level constant (must be initialized exactly once)
    static final double PI = 3.14159;

    // 5) FINAL REFERENCE VARIABLE
    void testFinalReference() {
        final int[] arr = new int[3];   // final reference, not final contents
        arr[0] = 10;                    // ✅ allowed (changing contents)
        arr[1] = 20;

        // arr = new int[5];            // ❌ NOT allowed (cannot reassign final reference)
        System.out.println("arr[0] = " + arr[0]);
    }

    // 6) FINAL LOCAL VARIABLE
    void testFinalLocal() {
        final int x = 5;
        System.out.println("x = " + x);

        // x = 7;                       // ❌ NOT allowed (cannot change a final variable)
    }

    // 7) FINAL WITH FOR-EACH LOOP
    void testFinalForEach() {
        String name = "Samuel";
        for (final char c : name.toCharArray()) {
            // c = 'X';                 // ❌ NOT allowed (c is final)
            System.out.println(c);      // ✅ allowed
        }
    }
}


// MAIN CLASS
public class FinalDemo {
    public static void main(String[] args) {

        // Use final class and its final method
        FinalClass fc = new FinalClass();
        fc.showConstant();  // prints CONSTANT_VALUE

        // Use DemoFinal to show other final rules
        DemoFinal demo = new DemoFinal();

        // Access final static variable
        System.out.println("PI = " + DemoFinal.PI);

        demo.testFinalReference();
        demo.testFinalLocal();
        demo.testFinalForEach();
    }
}
