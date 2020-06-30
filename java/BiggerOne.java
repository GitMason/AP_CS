// BiggerOne.java
// Assignment 53: Biggerone program

import java.util.Scanner;

public class BiggerOne
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int num1;
    int num2;
    
    System.out.println("Please input a number: ");
    num1 = s.nextInt();
    System.out.println("Please input a second number: ");
    num2 = s.nextInt();
    
    System.out.println(isBigger(num1, num2) + " is the bigger number.");
  }
  
  private static int isBigger(int x, int y)
  {
    if (x > y){return x;}
    else if (y > x){return y;}
    else{return x;}
  }
}



