// Cylinder.java
// Assignment 88

public class Cylinder extends Circle
{ 
  private double h;
  
  public Cylinder()
  {
    super();
  }
  
  public double setHeight(double height)
  {
    h = height;
    return(h);
  }
  
  public double getHeight()
  {
    return(h);
  }
  
  public double findVolume()
  {
    return findArea() * h;
  }

  


}



  
  
  