package oops;

public class ConstructorDemo {
	public static void main(String[] args) {
		Test478 tes1 = new Test478();
	}
}

// by default every class has a default constructor
// non parameterized
// but if you create one constructor explicit, then default constructor vanish

//Constructor name should be same as class name
//There is no return type of constructor

class Test478{

	int i ;
	Test478(){
		this(10);
	}
	Test478(int i){
		System.out.println("param1");	
	}
	Test478(String i){
		
	}
	
	void Test78(int i) {
		
	}
	
	void test1() {
		test1(10);
	}
	void test1(int i) {

	}
	void test1(String i) {

	}


}
