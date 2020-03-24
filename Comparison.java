// Comparison.java
// Assignment 27: Modifying the Comparison Program

import java.util.Scanner; // using the Scanner class through import statement

public class Comparison
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in); //Scanner variable dec
    
    
   double num1; // 1st number
   double num2; // 2nd number
   
   System.out.println("Enter the first number: ");
   num1 = s.nextDouble(); // get 1st number
   
   System.out.println("Enter the 2nd number: ");
   num2 = s.nextDouble(); // get 2nd number
  
  System.out.println("Is the 1st number less than or equal to the 2nd number? " + (num1 <= num2) + "!"); //true if less than or equal, false if greater than
  }
}
