public class RandomStringChooserMain{
  
  public static void main(String[] args){
    String[] wordArray = {"wheels", "on", "the", "bus"};
    RandomStringChooser sChooser = new RandomStringChooser(wordArray);
    for (int i = 0; i < 6; i++){
      System.out.print(sChooser.getNext() + " ");
    }
  }
}
    