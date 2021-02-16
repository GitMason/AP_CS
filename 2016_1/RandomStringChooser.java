import java.util.*;

public class RandomStringChooser{
  
  private List<String> words = new ArrayList<String>();
  
  public RandomStringChooser(String[] wordArray){
    for(int i = 0; i < wordArray.length; i++){
      words.add(wordArray[i]);
    }
  }
  
  public String getNext(){
    if(words.size() < 1){return "NONE";}
    
    Random x = new Random();
    int rand = x.nextInt(words.size());
    
    String chosenWord = words.get(rand);
    words.remove(rand);
    return chosenWord;
  }
}