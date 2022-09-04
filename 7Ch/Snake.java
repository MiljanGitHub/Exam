public sealed class Snake permits Cobra{ //DOES NOT 
	public static void main(String args[]) {
	 	System.out.print("D");	 
	}
 	final class Cobra extends Snake {} //nested subclass
}