// Polygon.java
// Assignment 61

public class Polygon
{
  private int numSides;
  
  public Polygon()
  {
    numSides = 0;
  }
  
  public Polygon(int numSides)
  {
    this.numSides = numSides;
  }
  
  public void setPolygon(int numSides)
  {
    this.numSides = numSides;
  }
  
  public int getPolygon(int numSides)
  {
    return numSides;
  }
  
  public String toString()
  {
    return "This polylgon has " + numSides + " sides.";
  }
}