import java.util.*;

public class StringFormatterMain{
  
  public static void main(String[] args){
    
    List<String> test = new ArrayList<String>();
    test.add("test");
    test.add("test2");
    test.add("test_3");
    
    StringFormatter stringthing = new StringFormatter();
    System.out.println(stringthing.totalLetters(test));
    System.out.println(stringthing.basicGapWidth(test, 20));
    System.out.println(stringthing.leftoverSpaces(test, 20));
    System.out.println(stringthing.format(test, 20));
  }
}