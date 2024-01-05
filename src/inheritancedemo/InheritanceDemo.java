package inheritancedemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		B b1 = new B();
		
	}
}

// Red color
// private method never inherit
class A{
	public void m1() {
		
	}
}

// blue
class B extends A{
	public void m2() {
		
	}
}

// Variables visibility



