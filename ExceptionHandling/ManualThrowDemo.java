import java.util.*;
import java.io.IOException;

public class ManualThrowDemo {

    static class InvalidAge extends RuntimeException {
        public InvalidAge(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            throw new InvalidAge("Age must be 18 or older to register.");
        } else {
            System.out.println("Registration successful!");
        }
    }
}
