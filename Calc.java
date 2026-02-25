// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

import java.util.Scanner;
public class Calc{
      public static void main(String[] var0) {
     
      System.out.println("Hello, World!");
       String name="calculater";
       int choice;

       Scanner sc = new Scanner(System.in);
       do{ 
            System.out.println("=====Menu=====");
            System.out.print("1.Addition");
            System.out.print("2.Multi");
            System.out.print("3.Div");
            System.out.print("4.Sub");
            System.out.print("5. Exit")

            choice= sc.nextInt();


            System.out.print("Enter number 1: ");
            int num = sc.nextInt(); 
            
            System.out.print("Enter number 2: ");
            int num2 = sc.nextInt(); 

            switch(choice){
               case 1:
                  System.out.println(num + num2);
                           }

            
           
       }while(choice != 5);

      
      
   }
}

