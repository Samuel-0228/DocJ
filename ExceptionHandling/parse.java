
public class parse {
    public static void main(String[] args) {
        String invalidNumber = "10abc"; // Contains letters!

        try {
            // This will instantly jump to the catch block
            int result = Integer.parseInt(invalidNumber);
            System.out.println("The result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot turn '" + invalidNumber + "' into a number!");
        }
    }
}
