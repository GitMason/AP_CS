public class MultPractice implements StudyPractice{
    
    private int numOne;
    private int numTwo;

    public MultPractice(int first, int second){
       numOne = first;
       numTwo = second;
    }

    public String getProblem(){
      return(numOne + " TIMES " + numTwo);
    }

    public void nextProblem(){
      numTwo++;
    }
}