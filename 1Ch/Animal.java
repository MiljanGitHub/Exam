import java.util.*;

public class Animal {
    String a;
    public static void main(String[] args) {
        System.out.println("This is my first Java Prograssssm");	
		if (args.length >= 1) {
			Date d;	HelperClass hp;
			 System.out.println(args[0]);
			System.out.println(args[1]);

		}
	  System.out.println("This is my first Java Prograssssm");

       // class Test2 {} //Compiler generates ---> Animal$1Test2.class

       // class Test {}  //Compiler generates ---> Animal$1Test.class
    }

    //class Test {} //Compiler generates ---> Animal$Test.class
	
	//error: class Animal is already defined in package unnamed package
       // class Animal{

	//class Animal{
	//}

	//static class Test {}

}