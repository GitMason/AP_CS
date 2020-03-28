// PosNeg.java
// Assignment 36: Positive negative number program

import java.util.Scanner;

public class PosNeg
{
  public static void main(String[] args)
  {
    
    Scanner s = new Scanner(System.in);
    int num;
    
    System.out.println("You're already wasting my time. Just insert an integer already. I'll probably be disappointed anyways. *sigh*");
    num = s.nextInt();
    
    if (num > 0)
    {
      System.out.println("You inserted a positive number? Seems a little cliche.");
    }
    
    else if (num < 0)
    {
      System.out.println("I can't believe that you inserted a negative number! You should be ashamed of yourself.");
    }
    
    else
    {
      System.out.println("Wow how creative. You put zero. Soooooo booooring.");
    }
  }
}