package oops;

public class VariableScope {
	public static void main(String[] args) {
		
		Test700 t1 = new Test700();
		System.out.println(t1);
		t1.i = 180;
		t1.test1();
		
	}
}


class Test700{
	int i = 10; // instance
	static int j = 20; // static
	
	void test1() {
		int i = 40; // local
		int j = 60; // local
		 
		// variable shadowing
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(Test700.j);
		System.out.println(this.i);
		
	}
}