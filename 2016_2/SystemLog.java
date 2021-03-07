import java.util.*;
public class SystemLog{
  private ArrayList<LogMessage> messageList;
  
  public SystemLog(List<LogMessage> systemLog){
    messageList = new ArrayList<LogMessage>();
    for(LogMessage message : systemLog){
      messageList.add(message);
    }
  }
  
  public List<LogMessage> removeMessages(String keyword){
    ArrayList<LogMessage> validMessages = new ArrayList<LogMessage>();
    ArrayList<LogMessage> temp = new ArrayList<LogMessage>();
    for(LogMessage message : messageList){temp.add(message);}
    
    for(LogMessage message : temp){
      if(message.containsWord(keyword)){
        validMessages.add(message);
        messageList.remove(message);
      }
    }
    return validMessages;
  }
}