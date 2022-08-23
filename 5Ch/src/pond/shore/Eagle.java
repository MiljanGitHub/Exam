package pond.shore;
public class Eagle extends Bird {
 
	//Eagle is extending Bird

	public void throughReference(){

		//Preconditions:
		// - We are in a subclass of a target class ('Bird' in this case)
		// - We are in a same package as a target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a target type ('Bird' in this case)
		
		Bird b = new Bird();
		b.floatInWater(); //DOES COMPILE //Referring to protected members through reference variable of type which has those protected member is OK. 
		System.out.print(b.text); //same here
		
		Eagle e = new Eagle(); //DOES COMPILE
		e.floatInWater();
		
	}

	public void withoutReference(){


		//Preconditions:
		// - We are in a subclass of a target class ('Bird' in this case)
		// - We are in a same package as a target class ('Bird' in this case)
		// - Trying to access protected members without a reference variable of a target type ('Bird' in this case)

		floatInWater(); //Referring to protected members (of superclass) without reference variable of type which has those protected member is OK. 
		System.out.print(text); //same here
		
	}

}