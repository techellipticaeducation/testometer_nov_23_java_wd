package inheritancedemo;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		A1 b1 = new B1();
		b1.m1();
	}
	//  Runtime Polymorphism
}

class A1{
	public void m1() {
		System.out.println("A1->m1");
	}
}
class B1 extends A1{
	public void m2() {
		System.out.println("B1->m2");
	}
	public void m1() {
		super.m1();
		System.out.println("B1->m1");
	}
}
