import java.util.Scanner;

public class Fibonacci {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    System.out.println(fibonacci(n));
  }
 
  public static int fibonacci(int n) {
    if (n == 1){return(n);}
    else if (n == 0){return(n);}
    else {
      return(fibonacci(n-1) + fibonacci(n-2));
    }
  }
}