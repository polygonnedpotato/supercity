public class Debuggering {
  public static class logging{
    public static void log(String Source, String Message){
      System.out.println("<L>["+Source+"]: "+Message+"\033[9m");
    }
    public static void logWarn(String Source, String Message){
      System.out.println("\033[33m<W>["+Source+"]: "+Message+"\033[9m");
    }
    public static void logError(String Source, String Message){
      System.out.println("\033[31m<E>["+Source+"]: "+Message+"\033[9m");
    }
    public static void logNote(String Source, String Message){
      System.out.println("\033[34m<N>["+Source+"]: "+Message+"\033[9m");
    }
    public static void logDebug(String Source, String Message){
      System.out.println("\033[35m<D>["+Source+"]: "+Message+"\033[9m");
    }
    public static void setLogFileLocation(String fileLocation){
      System.out.println("\033[34m<N>[Debuggering.logging.setLogFileLocation]: \"Debuggering.logging.setLogFileLoation\" doesn't do anything yet.");
      System.out.println("\033[35m<D>[Debuggering.logging.setLogFileLocation]: Log File will now be saved at: \""+fileLocation+"\"");
    }
  }
}
