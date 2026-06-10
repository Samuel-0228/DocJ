import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {

    public static void main(String[] args) {

        // You wrap FileWriter inside PrintWriter to combine their strengths
        try (

                java.io.PrintWriter pw = new java.io.PrintWriter(new FileWriter("file2.txt"))) {
            pw.println("Age: " + 25); // Automatically handles conversion and newlines
            pw.printf("Coordinates: [%d, %d]\n", 10, 20); // Supports formatted strings
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
