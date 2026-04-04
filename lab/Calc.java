
import java.util.Scanner;
public class Calc{
      public static void main(String[] args) {
     
      System.out.println("Hello, World!");
       String name="calculater";
       int choice;

       Scanner sc = new Scanner(System.in);
       do{ 
          System.out.println("""
                        =====Menu=====
                        1. Addition
                        2. Multiply  
                        3. Division
                        4. Subtract
                        5. Exit
                        Enter choice: """);


            choice= sc.nextInt();

            if(choice == 5){
               break;
            }
            System.out.print("Enter number 1: ");
            int num = sc.nextInt(); 
            
            System.out.print("Enter number 2: ");
            int num2 = sc.nextInt(); 

            switch(choice){
               case 1:
                  System.out.println(num + num2);
                  break;
               case 2:
                  System.out.println(num * num2);
                  break;
               case 3:
                  if(num2!=0){
                  System.out.println(num / num2);}
                  else  System.out.println("Can't divide by zero");
                  break;
               case 4:
                  System.out.println(num - num2);
                  break;
               case 5:
                  System.out.println("Exit");
                  break;
               default:
                  System.out.println("Invalid choice");
                  break;
                           }
           }while(choice != 5);

      
      
   }
}

