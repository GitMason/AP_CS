import java.util.Arrays;

public class DiverseArrayMain{
  
  public static void main(String[] args){
    int[] arr1 = {1, 3, 7, 5, 12};
    System.out.println(DiverseArray.arraySum(arr1));
    
    int[][] arr2D = {{1,2,3}, {3,4}, {1,5,7,}};
    int[][] notDiverse = {{1,2,3}, {1,2,3}, {0,0}};
    System.out.println(Arrays.toString(DiverseArray.rowSums(arr2D)));
    
    System.out.println(DiverseArray.isDiverse(arr2D));
    System.out.println(DiverseArray.isDiverse(notDiverse));
  
  
  
  }
}