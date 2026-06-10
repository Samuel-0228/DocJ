public class MixedStackDemo {

    // Level 3: The deep method that throws different errors
    public static void method3(int choice) throws Exception {
        if (choice == 1) {
            throw new IllegalArgumentException("Error Type 1"); // Unchecked
        } else if (choice == 2) {
            throw new java.io.IOException("Error Type 2"); // Checked
        } else if (choice == 3) {
            throw new Exception("Error Type 3"); // Generic Checked
        }
    }

    // Level 2: Calls method3 and handles Exception Type 1
    public static void method2(int choice) throws Exception {
        try {
            method3(choice);
        } catch (IllegalArgumentException e) {
            // Target caught here!
            System.out.println("Handled in method2: " + e.getMessage());
        }
        System.out.println("method2: Statement after try-catch executed.");
    }

    // Level 1: Calls method2 and handles Exception Type 2
    public static void method1(int choice) throws Exception {
        try {
            method2(choice);
        } catch (java.io.IOException e) {
            // Target caught here!
            System.out.println("Handled in method1: " + e.getMessage());
        }
        System.out.println("method1: Statement after try-catch executed.");
    }

    // Top Level: Calls method1
    public static void main(String[] args) throws Exception {
        System.out.println("--- TEST 1 (Caught in method2) ---");
        method1(1);

        System.out.println("\n--- TEST 2 (Caught in method1) ---");
        method1(2);

        System.out.println("\n--- TEST 3 (Uncaught Crash) ---");
        method1(3); // This will crash the app!

        // These lines below will NEVER execute because Test 3 terminates the app
        System.out.println("main: Statement 1 after try-catch.");
        System.out.println("main: Statement 2 after try-catch.");
    }
}
