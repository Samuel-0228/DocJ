import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file1.txt")) {
            fw.write("Age: ");
            fw.write(String.valueOf(25)); // Must manually convert ints to String
            fw.write(System.lineSeparator()); // Must manually add platform newlines
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
