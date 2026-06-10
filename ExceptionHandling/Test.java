public class Test {
    public static void main(String[] args) {
        try {
            method();
            // This WILL print because method() handles its own exception internally!
            System.out.println("After the method call");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception {
        try {
            String s = "abc";
            // Throws StringIndexOutOfBoundsException (index 3 doesn't exist)
            System.out.println(s.charAt(3));
        } catch (RuntimeException ex) {
            // Catches the error right here
            System.out.println("RuntimeException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }
}
