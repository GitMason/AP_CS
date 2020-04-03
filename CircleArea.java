//CircleArea.java
// Assignment 68: Calculating Circle Area

import java.util.Scanner;

public class CircleArea
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please input a circle radius as an integer:");
    int r = s.nextInt();
    
    System.out.println("The area is " + calcArea(r));
    
  }
  
  
  public static double calcArea(int radius)
  {
    double area;
    area = radius * radius * Math.PI;
    return(area);
  }
}