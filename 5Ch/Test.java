class Test{

public static void main(String[] args) {
	System.out.println();
	StringBuilder sb = new StringBuilder("abcdef");
	sb.replace(0,5, "ff");
	System.out.println(sb);	
	String ss = "abcd";
	
System.out.println(ss.replace("bc", "ff"));
}

}