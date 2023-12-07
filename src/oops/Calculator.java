package oops;

public class Calculator {

	int i = 10;
	static int j = 10;
	static int k = 20;
	
	
	/**
	 * This method is learn documentation comment in java. <BR/> 
	 * This line i am writing for HTML presentation
	 * @param i
	 * @param j
	 */
	 static void commentMethod(int i , int j){
		  
	  }
	
	// Documentation 
	/**
	 * This method is i am creating to generate sum of input value
	 * <BR/>
	 * This techellitica session for java
	 * @param i
	 * @param j
	 * @return
	 */
	int sum(int i, int j){
		int k = i+j;
		return k;
	}
	
	// Non-Parameterized method
	double valueOfPi() {
		return 3.14;
	}
	
	// no return type required
	//  non paramterized 
	static void noReturn() {
		System.out.println("hello");
		return;
	}

	// static method
	static void test5(){
		
	}
	
	
	
	
	// Blocking language	
	{
		System.out.println("Hello Guys");
	}
}
