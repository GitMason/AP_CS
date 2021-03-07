import java.util.*;
public class LogMessageMain{
  public static void main(String[] args){
    String message1 = "SERVER1:disk";
    String message2 = "SERVER2:error on /dev/disk";
    String message3 = "Webserver:read error on disk DSK1";
    
    LogMessage mess1 = new LogMessage(message1);
    LogMessage mess2 = new LogMessage(message2);
    LogMessage mess3 = new LogMessage(message3);
    System.out.println(mess1.getID());
    System.out.println(mess1.getMessage());
    System.out.println(mess1.containsWord("disk"));
    
    ArrayList<LogMessage> theLog = new ArrayList<LogMessage>();
    theLog.add(mess1);
    theLog.add(mess2);
    theLog.add(mess3);
    for(LogMessage mess : theLog){
      System.out.println(mess.getID() + ":" + mess.getMessage());
    }
    
    SystemLog log = new SystemLog(theLog);
    List<LogMessage> validMessages = log.removeMessages("disk");
    for(LogMessage mess : validMessages){
      System.out.println(mess.getID() + ":" + mess.getMessage());
    }
    
  }
}