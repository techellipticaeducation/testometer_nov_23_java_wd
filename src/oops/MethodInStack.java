package oops;

public class MethodInStack {
	public static void main(String[] args) {
		m1(); // 1 4 3 5 2
		// 1 4 3 2 5
		
//		[A-Za-z$_]
		
		
	}

	static void m1() {
		System.out.println("1");
		m2();
		System.out.println("2");
	}

	static void m2() {
		System.out.println("4");
		m3();
		System.out.println("5");
	}

	static void m3() {
		System.out.println("3");
	}

//	stack

}



