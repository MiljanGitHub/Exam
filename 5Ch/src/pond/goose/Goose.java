package pond.goose;
import pond.shore.Bird;
import pond.shore.Eagle;
public class Goose extends Bird {
 
	public void withoutReference(){

		//Preconditions:
		// - We are in a subclass of a target class ('Bird' in this case)
		// - We are in a different package then target class ('Bird' in this case)
		// - Trying to access protected members without a reference variable of a target type ('Bird' in this case)
		
		floatInWater(); //DOES COMPILE 
		//System.out.print(text); //same here
		
	}
	
	public void throughItsOwnReference(){
		//Preconditions:
		// - We are in a subclass of a target class ('Bird' in this case)
		// - We are in a different package then target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a (this) current defined subclass of a target type ('Bird' in this case)
		
		/*
		 * If we were to define a subclass of Goose such as 'public class Goosling extends Goose{}', we could do the following within this class:
		 * 
		 * public void test(){
		 * 		Goosling ss = new Goosling();
		 *		ss.floatInWater(); //DOES COMPILE
		 * }
		 */
		
		Goose g = new Goose();
		g.floatInWater(); //DOES COMPILE 
		System.out.print(g.text); //same here
	}

	public void throughTargetReference(){
		//Preconditions:
		// - We are in a subclass of a target class ('Bird' in this case)
		// - We are in a different package then target class ('Bird' in this case)
		// - Trying to access protected members through a reference variable of a target type ('Bird' in this case)
		
		Bird b = new Bird();
		//b.floatInWater(); //DOES NOT COMPILE  'floatInWater() has protected access in Bird'; DOES NOT COMPILE
		//System.out.print(b.text); //same here
		
		Bird be = new Eagle();
		// be.floatInWater(); //DOES NOT COMPILE 
		
		
	}
	
	public void throughOtherSubclassReference(){
		Eagle e = new Eagle();
		//e.floatInWater(); //DOES NOT COMPILE
	}
	



	public void withReferenceOfSubclass(){

		//Preconditions:
		// - We are in a subclass of a target class ('Bird' in this case)
		// - We are in a different package then target class ('Bird' in this case)
		// - Trying to access protected members by using a reference variable of a subclass of a target type ('Bird' in this case)
		Eagle e = new Eagle();
		//e.floatInWater(); //DOES NOT COMPILE 
		//System.out.print(e.text); //same here
		
	}

}