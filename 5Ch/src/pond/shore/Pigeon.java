package pond.shore;
public class Pigeon  {
 
	

	public void withBirdReference(){

		//Preconditions:
		// - We are not in a subclass of a target class ('Bird' in this case)
		// - We are in a same package as a target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a target type ('Bird' in this case)

		Bird b = new Bird();
		b.floatInWater(); //DOES COMPILE //Referring to protected members of a type whose reference variable we are using and which has those protected member is OK. 
		System.out.print(b.text); //same here
		
	}

	public void withBirdSubclassReferences(){

		//Preconditions:
		// - We are not in a subclass of a target class ('Bird' in this case)
		// - We are in a same package as a target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a subclass of a target type ('Bird' in this case)

		Eagle e = new Eagle();
		e.floatInWater(); //DOES COMPILE
		System.out.print(e.text); 
		
	}

}