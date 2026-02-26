/*6.	Write a program that simulates coin tossing. For each toss
 of the coin, the program should print Heads or Tails. Let the program 
 toss the coin 100 times and count the number of times each side of 
 the coin appears. Print the results. The program should call
  a separate function flip that takes no arguments and returns 
  0 for tails and 1 for heads. [Note: If the program realistically 
  simulates the coin tossing, then each side of the coin should appear 
  approximately half the time */

import java.util.Scanner;
  public class prob{
    
    public static void main(String[] args){
        int head=0,tail=0;
     while((head+tail)<=100){   
        srand(time(0));
        int face= rand()%2;
        if(face==0){
            head++;
        }
        else{
            tail++;
        }}

        system.out.println("Heads: "+head);
        system.out.println("Heads: "+head);

    }
  }