import java.util.*;

public class StringFormatter{    
  
  public static int totalLetters(List<String> wordList){
    int letters = 0;
    for(String word:wordList){
      letters += word.length();
    }
    return letters;
  }
  
  public static int basicGapWidth(List<String> wordList, int formattedLen){
    
    //find the difference between the total length and the length of the letters (a.k.a. the number of spaces)
    int spaces = formattedLen - totalLetters(wordList);

    //find potential remainder so we are left with integers when we divide
    int remainder = spaces % (wordList.size() - 1);
    
    return (spaces - remainder) / (wordList.size() - 1);
  }
  
  public static int leftoverSpaces(List<String> wordList, int formattedLen){
    return (formattedLen - totalLetters(wordList)) % (wordList.size() - 1);
  }
  
  
  public static String format(List<String> wordList, int formattedLen){
    
    int leftovers = leftoverSpaces(wordList, formattedLen);
    String formattedString = "";
    String basicGap = "";
    for(int i = 0; i < basicGapWidth(wordList, formattedLen); i++){
      basicGap = basicGap + " ";
    }
    
    for(String word:wordList){
      formattedString = formattedString + word + basicGap;
      if(leftovers > 0){
        formattedString = formattedString + " ";
        leftovers--;
      }
    }
    
    formattedString = formattedString.substring(0, formattedString.length() - basicGapWidth(wordList, formattedLen));
    return formattedString;
  }

}


  
      