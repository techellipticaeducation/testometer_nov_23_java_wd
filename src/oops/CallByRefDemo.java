package oops;

public class CallByRefDemo {
	public static void main(String[] args) {

		Test600 test1 = new Test600();
		System.out.println(test1.i);
		test1.changeTo100(test1);
		System.out.println(test1.i);
		
	}
}


class Test600{
	int i = 10;
	void changeTo100(Test600 test) {
		test.i = 100;
	}
}
