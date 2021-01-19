public class HiddenWord{
  
  private String word;
  public HiddenWord(String secretWord){
    word = secretWord;
  }
  
  public String getHint(String guess){
    //check if the guess is correct
    if(guess == word){return word;}
    
    else{
      //create a string that holds the hint
      String hint = "";
      
      for(int i = 0; i < guess.length(); i++){
        
        //check to see if specific letters are correct and indicate with the letter
        if(guess.charAt(i) == word.charAt(i)){
          String letter = String.valueOf(guess.charAt(i));
          hint = hint.concat(letter);
        }
        else{
          for(int j = 0; j < guess.length(); j++){
            
            //check if letter is somewhere else in the word and idicate with +
            if(guess.charAt(i) == word.charAt(j)){
              hint = hint.concat("+");
              break;
            }
            
            //check if we go through each letter and don't find a match (i.e. not in word) and indicate with *
            else if(j == guess.length() - 1){
              hint = hint.concat("*");
            }
          }
        }
      }
      return hint;
    }
  }          



}
  