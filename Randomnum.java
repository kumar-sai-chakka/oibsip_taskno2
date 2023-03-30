import java.util.Scanner;
import java.util.Random;
public class Randomnum{
 public static void main(String args[]){
  // create instance of Random class
     Random rand = new Random();

     // Generate random integers in range 0 to 999
     int rand_int1 = rand.nextInt(100);
     int count=0;
     while(true){
      System.out.print("Enter a number from 0 to 100:");
      Scanner ob=new Scanner(System.in);
      int n=ob.nextInt();
      
      if(n==rand_int1){
       
       System.out.println("You have Guessed the correct number");
       break;
      }else{
       count++;
       System.out.println("Oh No wrong!");
       if(n>rand_int1){
        System.out.println("You have Guessed a greater number");
       }else{
        System.out.println("You have Guessed a less number");
       }
      }  
     }
     System.out.println("You have gessued in:"+(count+1)+" chance");
     System.out.println("Your score is:"+(int)count/2);
    }
   }