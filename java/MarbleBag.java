//MarbleBag.java
//Assignment 75: Bag of Marbles

public class MarbleBag
{
  public static void main(String[] args)
  {
    String[] bag = {"Yellow", "Yellow", "Yellow", "Blue", "Red", "Red", "Green", "Green", "Green", "Green"};
    
    int x = (int)(Math.random()*10)+1;
    
    System.out.println("You got a " + bag[x] + " marble!");
  }
}
