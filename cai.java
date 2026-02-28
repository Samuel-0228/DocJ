import java.util.Scanner;
import java.util.Random;

public class cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        do {
            System.out.println("Enter Your choice: ");
            System.out.println("1. Add");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            
            if(choice == 2) break;
            
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            
            System.out.println("What is " + num1 + " times " + num2 + "? ");
            int answer = sc.nextInt();
            
            if(answer == (num1 + num2)) {
                System.out.println("You're correct!");
            } else {
                System.out.println("Incorrect.");
            }
        } while(true);
        sc.close();
    }
}
