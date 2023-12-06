package oops;

public class Calculator {

	// Parameters
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
	void noReturn() {
		System.out.println("hello");
		return;
	}

}
