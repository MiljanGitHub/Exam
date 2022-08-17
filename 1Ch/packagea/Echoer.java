//package packagea;

public class Echoer {
   private String req = null;
   private String res = null;
   public void setReq(String r) {
      req = new String(r);
      char[] a = r.toCharArray();
      int n = a.length;
      for (int i=0; i<n/2; i++) {
         char t = a[i];
         a[i] = a[n-1-i];
         a[n-i-1] = t;
      }
      res = new String(a);
   }
   public String getRes() {
      return res;
   }
}