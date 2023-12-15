package oops;

public class CallByValueDemo {
	public static void main(String[] args) {
		Test200 test1 = new Test200();
		int i = 10;
		System.out.println(i);
		test1.make50(i); 
		System.out.println(i);
		
		// Call by value - actual variable , copy create
		// Datatype 
		// int float char double byte long short boolean
		
	}
}

class Test200{
	
	 void make50(int i) {
		i = 50;
	}
	
}


