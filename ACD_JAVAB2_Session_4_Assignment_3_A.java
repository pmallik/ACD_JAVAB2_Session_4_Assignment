package package2;

public class A extends B {
	public void test()
	{
		System.out.println("This is test from A Class");
		super.test();
		
	}
	




	public static void main(String[] args) {
		
       A obj1 = new A();
       obj1.test();
	}
}

//Ans f. because we can only call immediate parent class method
//using super keyword

//Select the one correct answer.
//a. test();
//b. super.test();
//c. super.super.test();
//d. ::test();
//e. C.test();
//f. It is not possible to invoke test() method defined in C from a method in A.