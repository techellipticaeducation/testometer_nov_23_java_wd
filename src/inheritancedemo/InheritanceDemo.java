package inheritancedemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		
		B b1 = new B();  
		b1.m2();
		
	}
}

// Single level
// Multi Level
// Herirachial 

//one parent can hve multple child
// Multiple inheritance not allowed in JAVA (ambiguity)
// one child can have multiple parent


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

class C extends A{
	
}
// Variables visibility



