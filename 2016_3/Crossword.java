public class Crossword{
  
  private Square[][] puzzle;
  
  public Crossword(boolean[][] blackSquares){
    int temp = 1;
    for(int i = 0; i < blackSquares.length - 1; i++){
      for(int j = 0; j < blackSquares[i].length - 1; j++){
        if(blackSquares[i][j] == true){
          Square tempSquare = new Square(true, 0);
          puzzle[i][j] = tempSquare;
        }
        else if(toBeLabeled(i, j, blackSquares)){
          Square tempSquare = new Square(false, temp);
          puzzle[i][j] = tempSquare;
          temp++;
        }
        else{
          Square tempSquare = new Square(false, 0);
          puzzle[i][j] = tempSquare;
        }
      }
    }
  }
    
    
  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
    if(blackSquares[r][c] == true){return false;}
    else if(blackSquares[r-1][c] == true || blackSquares[r][c-1] == true){return true;}
    else{return false;}
  }

}