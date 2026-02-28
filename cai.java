import java.util.Scanner;
import java.util.Random;

public class cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int correctanswer=0;
        int answer=0;
        int num=10;
        
         System.out.println("Enter difficulty level: ");
            System.out.println("1. Hard(in random numbers between 1 and 1000)");
            System.out.println("2. Medium(in random numbers between 1 and 100)");
            System.out.println("3. Easy(in random numbers between 1 and 10)");
            int level = sc.nextInt();

            switch(level){
                case 1:
                    //rand = new Random(1000);
                    num=1000;
                    break;
                case 2:
                   // rand = new Random(100);
                    num=100;
                    break;
                case 3:
                   // rand = new Random(10);
                    num=10;
                    break;
            }
       
        
        do {
            System.out.println("Enter Your choice: ");
            System.out.println("1. Add");
            System.out.println("2. Multiply");
            System.out.println("3. Subtract");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            
            if(choice == 5) break;

            int num1 = rand.nextInt(num)+1;
            int num2 = rand.nextInt(num) + 1;

         switch(choice){ 
            case 1: 
                System.out.println("What is " + num1 + " plus " + num2 + "? ");
                answer = sc.nextInt();
                correctanswer=num1+num2;
                break;
            case 2:
                System.out.println("What is " + num1 + " times " + num2 + "? ");
                answer = sc.nextInt();
                correctanswer=num1*num2;
                break;
            case 3:
                System.out.println("What is " + num2 + " substracted from " + num1 + "? ");
                answer = sc.nextInt();
                correctanswer=num1-num2;
                break;
            case 4:
                System.out.println("What is " + num1 + " divided by " + num2 + "? ");
                answer = sc.nextInt();
                correctanswer=num1/num2;
                break;
        }

        if(answer==correctanswer){
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong. The correct answer is " + correctanswer);
        }

            
           
        } while(true);
        sc.close();
    }
}
