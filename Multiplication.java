// Multiplication.java
// Assignment 24: Creating a Multiplication Program

import java.util.Scanner; // import Scanner class from Java Class Libraries

public class Multiplication
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in); // variable declaration for a Scanner object
    
    int num1; // first number
    int num2; // second number
    int num3; // third number
    int product;  // sum of the two numbers
    
    System.out.println("Enter the first number: ");
    num1 = input.nextInt(); // get 1st number
    
    System.out.println("Enter the second number: ");
    num2 = input.nextInt(); // get 2nd number
    
    System.out.println("Enter the third number: ");
    num3 = input.nextInt(); // get 3rd number
    
    product = num1 * num2 * num3; // multiply the three numbers together
    
    System.out.println("The product is " + product);
    
    
  }
}
