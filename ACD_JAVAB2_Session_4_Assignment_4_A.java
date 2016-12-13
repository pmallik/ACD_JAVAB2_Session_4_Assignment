package package2;

public class ACD_JAVAB2_Session_4_Assignment_4_A extends ACD_JAVAB2_Session_4_Assignment_4 {

	 
	 ACD_JAVAB2_Session_4_Assignment_4_A()
		{
		 // calling constructor of parent class by using super from child class constructor
		 
		    super(10,5);
			System.out.println("Constructor of class A");
			
		}
	

	public static void main(String[] args) {
		
		// calling constructor of parent class by creating object and passing the value
		
		ACD_JAVAB2_Session_4_Assignment_4 p1 = new ACD_JAVAB2_Session_4_Assignment_4(10,20);
		
		ACD_JAVAB2_Session_4_Assignment_4_A c1 = new ACD_JAVAB2_Session_4_Assignment_4_A();

	}

}
