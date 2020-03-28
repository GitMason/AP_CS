// OddNum.java
// Assignment 39: Odd numbers program

import java.util.Scanner;

public class OddNum
{
  public static void main(String[] args)
  {
    int num1;
    int num2;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Input a number: ");
    num1 = s.nextInt();
    System.out.println("Input another number greater than the first: ");
    num2 = s.nextInt();
    
    // Create the first and last odd numbers
    if ((num1%2 != 0 && num2%2 != 0) && num2 > num1)      // Check if numbers are both odd
    {
      num1 += 2;
      num2 -= 2;
    }
    
    else if ((num1%2 == 0 && num2%2 != 0) && num2 > num1) // Check if num1 is even and num2 is odd
    {
      num1 ++;
      num2 -= 2;
    }
    
    else if ((num1%2 != 0 && num2%2 == 0) && num2 > num1) // Check if num1 is odd and num2 is even
    {
      num1 += 2;
      num2 --;
    }
    
    else if ((num1%2 == 0 && num2%2 == 0) && num2 > num1) // Check if both numbers are even
    {
      num1 ++;
      num2 --;
    }
    
    else
    {
      System.out.println("Whoops!");
    }
    
    
    // now that we have the first and last odd numbers, we need to check if there are any odd numbers between then at all
    if (num1 > num2)
    {
      System.out.println("You either didn't follow the rules, or you gave numbers that have no odd numbers in between them.");
    }
    
    else
    {
      System.out.println("The odd numbers between your two numbers are: ");
      
      while (num1 <= num2)        // stops when you reach the last odd number
      {
        System.out.println(num1); // print the number
        num1 += 2;                 // go to the next odd number
      }
    }     
  }
}