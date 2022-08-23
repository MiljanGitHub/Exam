package pond.shore;
public class TestMain{

public static void main(String[] args) {


		//Preconditions:
		// - We are not in a subclass of a target class ('Bird' in this case)
		// - We are in a same package as a target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a target type ('Bird' in this case)
		

	Bird b = new Bird();
	String t = b.text; //DOES COMPILE

		//Preconditions:
		// - We are not in a subclass of a target class ('Bird' in this case)
		// - We are in a same package as a target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a subclass of a target type ('Bird' in this case)


	Eagle e = new Eagle();
	String t1= e.text; //DOES COMPILE

	Bird be = new Eagle();
	be.floatInWater(); //DOES COMPILE

}



}