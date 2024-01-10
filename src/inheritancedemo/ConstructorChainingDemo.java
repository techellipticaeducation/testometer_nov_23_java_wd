package inheritancedemo;

public class ConstructorChainingDemo {
	public static void main(String[] args) {
		// object -> constructor
		K3 v1 = new K3();
		v1.m2();
	}
}

class K1{
	K1(){
		System.out.println("K1 Constructor");
	}	
	public void m1() {

	}
}

class K2 extends K1{
	K2(){
		System.out.println("K2 Constructor");
	}
	public void m2() {
		System.out.println("K2-> m2");
	}
public void m3() {
		
	}
}

class K3 extends K2{
	K3(){
		super();
		System.out.println("K3 Constructor");
	}
	public void m2() {
		super.m2();
		System.out.println("K3-> m2");
		m3();
	}
	
	public void m3() {
		
	}
	
}
