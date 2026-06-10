import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw {
    public int division(int num, int den) throws ArithmeticException {
        return num / den;
    }

    public void openFile() throws FileNotFoundException {
        FileReader fr = new FileReader("nonexistentfile.txt");
    }

    public static void main(String[] args) {
        Throw t = new Throw();
        try {
            t.division(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            t.openFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
