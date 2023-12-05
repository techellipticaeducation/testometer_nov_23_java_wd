package oops;

public class Human {

	String name; // instance
	int age; // instance
	static String country; // static variable
	
	
	void talk(String content) {
		int test = 10; 
		System.out.println(name + " - " + content);
	}
	
	void happybirthday() {
		System.out.println(name + " ! Happy Birthday");
		age++;
		if(age == 18) {
			System.out.println("Congratulation! today you are in adult category");
		}
	}
}
