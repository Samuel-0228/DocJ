public class StackUnwindingDemo {

    public static void main(String[] args) {
        System.out.println("Main: Calling method1()");
        method1();
        System.out.println("Main: Program finished successfully.");
    }

    public static void method1() {
        System.out.println("  Inside method1(): Setting up try-catch block.");
        try {
            System.out.println("  method1(): Calling method2()");
            method2(); 
            System.out.println("  method1(): This line will NEVER run.");
        } catch (ArithmeticException e) {
            // 🎯 The exception is FINALLY caught here after unwinding the stack!
            System.out.println("  method1() CATCH: Caught the exception here!");
            System.out.println("  Exception message: " + e.getMessage());
        }
        System.out.println("  Inside method1(): Continuing execution normally.");
    }

    public static void method2() {
        System.out.println("    Inside method2(): No try-catch block here.");
        System.out.println("    method2(): Calling method3()");
        method3(); 
        System.out.println("    method2(): This line will NEVER run.");
    }

    public static void method3() {
        System.out.println("      Inside method3(): No try-catch block here.");
        
        int a = 10;
        int b = 0;
        
        System.out.println("      method3(): 🔥 ABOUT TO DIVIDE BY ZERO (Throw Point) 🔥");
        // This line triggers an ArithmeticException
        int result = a / b; 
        
        System.out.println("      method3(): This line will NEVER run. Result: " + result);
    }
}
