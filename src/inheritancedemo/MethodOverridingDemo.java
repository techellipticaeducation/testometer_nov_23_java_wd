package inheritancedemo;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		M2 m = new M2();
		m.t1();
	}
}
// final variable , then i cannot change value
// final in a method, then we cannot override it
// final in a class, i cannot extend that class
// public or default

class M1{
	public void t1() {
		System.out.println("M1->t1");
	}
}

class M2 extends M1{
	public void t1() {
		System.out.println("M2->t2");
	}
}
// constructor chaining in inheritance
// super keyword
// Runtime polymorphism