import java.util.concurrent.ThreadLocalRandom;

public class FrogSimulation { /** Distance, in inches, from the starting position to the goal. */ 
  
  private int goalDistance; /** Maximum number of hops allowed to reach the goal. */ 
  private int maxHops; /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting * position to the goal, and numHops is the maximum number of hops allowed to reach the goal. * Precondition: dist > 0; numHops > 0 */ 
  
  public FrogSimulation(int dist, int numHops) { 
    goalDistance = dist; 
    maxHops = numHops;
  } 
  
  /** Returns an integer representing the distance, in inches, to be moved when the frog hops. */ 
  private int hopDistance() { 
    return(ThreadLocalRandom.current().nextInt(-5, 15));
  } 
  
  /** Simulates a frog attempting to reach the goal as described in part (a). * Returns true if the frog successfully reached or passed the goal during the simulation; *        false otherwise. */ 
  public boolean simulate() {  
    int currentDist = 0;         // stores how far the frog has hopped at a given time
    
    for(int numHops = 0; numHops < maxHops; numHops++){
      currentDist += hopDistance();                           // the frog hops one time
      if(currentDist >= goalDistance){return true;}           // then we check to see whether it reached the goal or had a negative distance
      else if(currentDist < 0){return false;} 
    }
    return false;
  }
  
  
  /** Runs num simulations and returns the proportion of simulations in which the frog * successfully reached or passed the goal. * Precondition: num > 0 */ 
  public double runSimulations(int num) {   
    int numTrue = 0;
    int numFalse = 0;    

    for(int i = 0; i < num; i++){                               // simulate num times and count how many times it returned true or false
      if(simulate()){numTrue++;}
      
      else{numFalse++;}
    }
    
    return(numTrue * 1.0 / (numTrue + numFalse));    // compare the number of true returns to the total number of times simulate() was called
  }
  
}