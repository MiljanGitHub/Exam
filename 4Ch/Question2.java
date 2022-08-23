class Question2{

public static void main(String[] args) {
	System.out.println();

 var s = "Hello";
 var t = new String(s);
 if ("Hello".equals(s)) System.out.println("one"); //one
 if (t == s) System.out.println("two");  
 if (t.intern() == s) System.out.println("three"); //three
 if ("Hello" == s) System.out.println("four"); //four
 if ("Hello".intern() == t)
System.out.println("five");

}

}