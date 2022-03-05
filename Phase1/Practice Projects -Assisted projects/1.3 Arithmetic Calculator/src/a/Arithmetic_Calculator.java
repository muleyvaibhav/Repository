package a;

import java.util.Scanner;

public class Arithmetic_Calculator
{
   public static void main(String[] args)
   {
      float a, b, res;
      int choice;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.print("Enter the Operation no  : ");
      choice = scan.nextInt();
      
      if(choice>=1 && choice<=4)
      {
         System.out.print("\nEnter 1st Number: ");
         a = scan.nextFloat();
         System.out.print("\nEnter 2nd Number: ");
         b = scan.nextFloat();
         
         if(choice==1)
            res = a+b;
         else if(choice==2)
            res = a-b;
         else if(choice==3)
            res = a*b;
         else
            res = a/b;
         
         System.out.println("\nResult = " +res);
      }
      else
         System.out.println("\nInvalid Choice!");
   } 
}