package pond.goose;

import pond.shore.Bird;
import pond.shore.Eagle;

public class TestMain {
	
	
	public static void main(String[] args) {
		
		Bird b = new Bird();
		//b.floatInWater(); //DOES NOT COMPILE, 
		
		Goose g = new Goose();
		//g.floatInWater(); //DOES NOT COMPILE, 
		
		Eagle e = new Eagle();
		//e.floatInWater(); //DOES NOT COMPILE, 

		Bird be = new Eagle();
		//be.floatInWater(); //DOES NOT COMPILE, 
		
		Bird bg = new Goose();
		//bg.floatInWater(); //DOES NOT COMPILE, 
	}
}
