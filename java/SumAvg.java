//SumAvg.java
//Assignment 77: Sum and Average of an Array

public class SumAvg
{
  public static void main(String[] args)
  {
    int[] x = {3, 5, 6, 8, 8, 10, 22};
    int sum = 0;
    int avgDivisor = 0;
    double avg = 0;
    
    for (int i : x)
    {
      sum += i;
      avg += i;
      avgDivisor += 1;
    }
    
    avg /= avgDivisor;
    System.out.println("The sum is " + sum + ", and the average is " + avg + ".");
  }
}