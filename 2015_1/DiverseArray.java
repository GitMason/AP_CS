public class DiverseArray{

  public static int arraySum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){sum += arr[i];}
    return sum;
  
  }
  
  public static int[] rowSums(int[][] arr2D){
    int len = arr2D.length;
    int[] sum = new int[len];
    for(int i = 0; i < arr2D.length; i++){
      sum[i] = arraySum(arr2D[i]);
    }
    return sum;
  }
  
  public static boolean isDiverse(int[][] arr2D){
    int[] arr = rowSums(arr2D);
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] == arr[j]){return false;}
      }
    }
    return true;
  }

}