//ckage packageb;
//import packagea.Echoer;

public class EchoerTest {
   public static void main(String[] a) {
      Echoer e = new Echoer();
      e.setReq("Hello world!");
      System.out.println(e.getRes());
   }
}