// PosOrNeg.java
// Assignment 83: Positive or Negative

import java.util.ArrayList;

public class PosOrNeg
{
  public static void main(String[] args)
  {
    ArrayList<Integer> x = new ArrayList<Integer>();
    
    x.add(3);
    x.add(-5);
    x.add(10);
    x.add(-10);
    x.add(13);
    
    int totalNeg = 0;
    
    
    for(int i = 0; i < x.size(); i ++)
    {
      if(x.get(i) < 0)
      {
        totalNeg ++;
      }
    }
    
    System.out.println(totalNeg);
  }
}


