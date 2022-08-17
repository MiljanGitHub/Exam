package p1.p2;

public class StringIntern {
    public static String hello = "Hello";
    public static void main(String[] args) {


        //important
        /*String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung");
        System.out.println(constantString == newString); //false
        String internedString = newString.intern();
        System.out.println(constantString == internedString); // true

        String s1 = "a";
        String s2 = s1.intern();
        System.out.println(s1 == s2); //true*/


/*        String str = new String("Welcome to JavaTpoint");
        String str1 = new String("Welcome to JavaTpoint");
        String x = str1.intern(); //pogledam na Pool da li imam ovakav string (po equalsu(Object)), ako imam vratim ref, ako ne, napravim novi na Pool-u i vratim ref
        boolean ss = x.equals(str);
        System.out.println(str == x); // prints false; poredim ref sa Heap-a i Pool-a
        System.out.println(str1 == x); // prints false; poredim ref sa Heap-a i Pool-a
        System.out.println("Welcome to JavaTpoint" == x); //true; Poredim iste ref sa Pool-a*/

/*        String str = new String("Welcome to JavaTpoint"); //Heap reference
        String str1 = new String("Welcome to JavaTpoint"); //Heap reference
        String x = str1.intern(); //Have a look on the Pool and see if there is a string which is equal (using equals(Object) from String class) with the object upon which the intern
            //is called. If it does exist, return that reference from the Pool, if it doesn't exist, added it to pool and return a reference;
        System.out.println(str == x); // prints false; comparing references from Heap-a and Pool-a
        System.out.println(str1 == x); // prints false; comparing references from Heap-a and Pool-a
        System.out.println("Welcome to JavaTpoint" == x); //true; comparing same references from Pool-a*/
/*
        String rat = "rat";
        String s15 = new StringBuilder().append("rat").append("pat").toString();
        System.out.println(s15 == (rat+"pat"));
        String s16 = "rat" + "pat";
        System.out.println(s15 == s16); //false
        System.out.println(s15.intern() == s16); //true*/


/*        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = "hello";
        concat += " world";
        System.out.println(singleString == oneLine); //true
        System.out.println(singleString == concat); //false*/

/*          String hello = "Hello", lo = "lo";
          System.out.println(hello == "Hello");
          System.out.println(StringIntern.hello == hello);
          System.out.println(hello == ("Hel"+"lo")); //Strings concatenated from constant expressions are computed at compile time and then treated as if they were literals.
          System.out.println(hello == ("Hel"+lo)); // Strings computed by concatenation at run time are newly created and therefore distinct.
          System.out.println(hello == ("Hel"+lo).intern());*/

/*        String first = "rat" + 1; //we have a compile-time constant that automatically gets placed in the string pool as "rat1"
        String second = "r" + "a" + "t" + "1"; //compile-time constant; treated as if they were literals.
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); //true
        System.out.println(first == second.intern()); //true; intern() returns reference from Pool if exists, if not it creates new reference on Pool and returns it.
        System.out.println(first == third); //false; we have a String constructor. This means we no longer have a compile-time constant, and third does not point to a reference in the string pool.
        System.out.println(first == third.intern());*/

      /*  String s1 = "Javatpoint";
        String s2 = s1.intern();
        String s3 = new String("Javatpoint");
        String s4 = s3.intern();
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s1==s4); //true
        System.out.println(s2==s3); //false
        System.out.println(s2==s4);//true
        System.out.println(s3==s4); //false


        String s = "d".intern();
        String p = "d"; // compiler treats it as String p = "d".intern();
        System.out.println(s == p); // prints true*/



/*        String theQuick = "The quick"; //pool
        String the = "The ";
        String quick = "quick";
        String myString = "The " + "quick"; //pool
        System.out.println(theQuick == myString); //true
        System.out.println(myString == (the+quick)); //false
        System.out.println(myString == ("The "+quick)); //false*/

        /*String str = new String("Welcome to JavaTpoint");
        String x = str.intern();
        System.out.println(str == x); //false */

        /*String str = new String("Welcome to JavaTpoint");
        String x = "Welcome to JavaTpoint".intern();
        System.out.println(str == x); //false*/


/*        String s1 = "a"; //allocated in the String Constant Pool
        s1 = s1.concat("b"); //contact() returns a new String object, allocated in the Heap
        String s2 = "ab";//"ab" still does NOT exist in the String Constant Pool, and it gets allocated there
        System.out.println(s1 == s2); //returns false, because one object is in the Heap,
                                     // and another is in the String Constant Pool, and as there already exists the object in the pool,
                                    // with the same value, existing object will be returned by `intern()`

        System.out.println(s1.intern() == s2); //true*/

/*        String s1 = "a";
        String s2 = "a";
        String s3 = new String("a");
//If you wish to move the String object, created with new operator, into the String Constant Pool, use intern()
        System.out.println(s3.intern() == s2); //true*/




/*        String str3 = new String("Welcome to JavaTpoint").intern(); // statement - 1
        String str4 = new String("Welcome to JavaTpoint").intern(); // statement - 2
        System.out.println(str3 == str4); // prints true*/

/*        String str5 = new String("Welcome to JavaTpoint").intern(); // statement - 1
        String str6 = new String("Welcome to JavaTpoint"); // statement - 2
        System.out.println(str5 == str6); // prints false*/






        /*
         Returns a canonical representation for the string object.
         A pool of strings, initially empty, is maintained privately by the class String.
         When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method,
         then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
         It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
         All literal strings and string-valued constant expressions are interned. String literals are defined in section 3.10.5 of the The Java™ Language Specification.
         Returns:
         a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
         jls
         3.10.5 String Literals*/
    }
}
