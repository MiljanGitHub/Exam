package packageb;
//package Desktop.1CH.packageb;
//import packagea.Object;
import packagea.ClassA; //kada radimo javac packagea/ClassA.java podrazumeva se da smo u 1Ch direktorijumu i da smo izvrsili kompajliranje ClassA.java sa package packagea;
				//jer da nismo u 1Ch direktorijumu tj da smo u samom packageb dir i pozovemo javac ClassB.java na ovoj liniji bi se zalio jer sa te lokacije pocinje
				//da trazi packageb.packagea.ClassA.class izkompajlirani fajl. Zato svaki fajl u svom direktorijumu mora da ima 'package ime-trenutnog-foldera' u odnosu na source-a
				//a kompajliranje da se vrsi iz root-a odnosno top level direktorijuma 
public class ClassB {
public static void main(String[] args) {
ClassA a; 
//Object O;
System.out.println("Got it");
}
}
