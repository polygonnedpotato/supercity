public class Main{
  public static class itrn{
    static String nme="SuperCity";
    static String rC="ALPHA";
    static String[] vr={"0","0","0"};
    static String devnme="elburg";
    static String strt=itrn.nme+" "+itrn.rC+"\nVersion: "+itrn.vr[0]+"."+itrn.vr[1]+"."+itrn.vr[2];
  };
  public static void main(String[] args) {
    System.out.println(itrn.strt);
    Debuggering.logging.setLogFileLocation("~/.scalpha/debuglog.log");
    Debuggering.logging.log("Main.main",itrn.nme+" is in an alpha state. This means that "+itrn.nme+" is not complete and will be very unstable at times.");
    Debuggering.logging.logError("Main.main","SuperCity is not ready for testing yet.");
  }
}

