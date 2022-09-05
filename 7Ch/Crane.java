public record Crane(int numberEggs, String name) {
	 public Crane(String firstName, String lastName) {
		 this(0, firstName + " " + lastName);
		
	 } 
	 
	 public Crane() {this(0, "");}
	 
	 public Crane{ 
		 this();
		 numberEggs = 1; //
		 name = "";
		 
	 }
}