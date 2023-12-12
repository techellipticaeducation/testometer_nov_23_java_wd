package oops;

public class LearningCheckDemo {
	
	static {
//		Test5.test2();
//		System.exit(10); // kill you jvm
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello5");
		// Sri - 2 credits
		// Priyanka - (P) 7 Credit, (K) 4 Crdit
		// Mukhesh - 10 credits
		
//		Test5 test = new Test5();
//		test.test1();
		
//		Test5 test = new Test5();
//		Test5 test1 = new Test5();
//		Test5 tes2 = new Test5();
//		Test5 test3 = new Test5();
//		Test5 test4 = new Test5();
		
		Test5 test = null;
		test.test2();
		
	}
}
// can we run our application without executing main method ?

class Test5{
	
	int m1 = m2;
	int k = 10;
	static int m = 20;
	static int m2 = 10;
	
	static{
		System.out.println("Hello0");
	}
	
	static void test2() {
		System.out.println("Hello1");
	}
	
	{
		System.out.println("Test67");
	}
	
	void test1() {
		System.out.println("Test70");
		
	}
	//How variable and methods works in  Memory 
	// static - class variable

	// static  variable, blocks, method
	// instance variable, blocks , method

	// static method never allowed instance variable directly. it allows only static variable
	// non-static method allow both static and instance variables

	
}