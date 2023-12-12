package oops;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		int k  = ScienceCalculator.add(10,20,34);
		System.out.println(k);
	}
}
// same name of method
// differnt number of param
// differnt type of param

// method overloading return type not depend
// Compile time polymorphism
class ScienceCalculator{

	static int add(int i , int j) {
		return i + j;
	}

	static int add(int i , int j, int m) {
		return ScienceCalculator.add(ScienceCalculator.add(i,j),m);
	}
	
	static double add(double i , int j) {
		double k = i + j;
		return k;
	}
}


