public class LogMessage{
  
  private String machineId;
  private String description;
  
  public LogMessage(String message){
    int colon = message.indexOf(":");
    
    machineId = message.substring(0, colon);
    description = message.substring(colon + 1, message.length());
  }
  
  public String getID(){return machineId;}
  public String getMessage(){return description;}
  
  public boolean containsWord(String keyword){
    //add spaces to the beginning and end of the description so that the spaces rule applies for beggining and end of message
    String tempDesc = " " + description + " ";
    if(tempDesc.contains(" " + keyword + " ")){return true;}
    return false;
  }
}

  
  