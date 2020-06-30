// bigNumber.java
// Assignment 35: Big Number Program

import java.util.Scanner;

public class bigNumber
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int num;
    
    System.out.println("Gimme a number (no decimals please) ");
    num = s.nextInt();
    
    if (num > 100)
    {
      System.out.println("That's a pretty big number you got there. Good job.");
    }
    
    else 
    {
      System.out.println("That's not very big. You could do better pal.");
    }
  }
}