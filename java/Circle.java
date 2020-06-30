// Circle.java
// Assignment 88

public class Circle
{
  private double r;
  
  public Circle()
  {
    r = 1.0;
  }
  
  public double getRadius()
  {
    return (r);
  }
  
  public double setRadius(double radius)
  {
    r = radius;
    return(r);
  }
  
  
  public double findArea()
  {
    return (r * r * Math.PI);
  }
}