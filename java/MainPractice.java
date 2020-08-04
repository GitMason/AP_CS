public class MainPractice{
  public static void main(String[] args){
    
    StudyPractice pract = new MultPractice(7, 3);
    
    System.out.println(pract.getProblem());
    pract.nextProblem();
    System.out.println(pract.getProblem());
  }
}