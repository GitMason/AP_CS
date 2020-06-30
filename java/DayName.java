// DayName.java
// Assignment 52: DayName Program

import java.util.Scanner;

public class DayName
{
  public static void main(String[] args)
  {
    int dayNum;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Give me a number from 1-7: ");
    dayNum = s.nextInt();
    
    System.out.println("That number's day of the week is " + getName(dayNum));
  }
  
  private static String getName(int num)
  {
    String dayName;
    
    if (num > 0 && num <= 7) // if valid
    {
      if (num == 1){dayName = "Sunday";}          // save space by making if/ else if statements on one line
      else if (num == 2){dayName = "Monday";}
      else if (num == 3){dayName = "Tuesday";}
      else if (num == 4){dayName = "Wednesday";}
      else if (num == 5){dayName = "Thursday";}
      else if (num == 6){dayName = "Friday";}
      else{dayName = "Saturday";}
    }
    
    else // if invalid
    {
      dayName = "ERROR. PLEASE INPUT A VALID NUMBER.";
    }
    
    return dayName;
  }
}