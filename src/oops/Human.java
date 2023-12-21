package oops;

public class Human {

	String name = "ABC"; // instance
	int age = 34; // instance
	static String country; // static variable
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	Human(String name){
		this.name = name;
	}
	Human(int age){
		this.age = age;
	}
	
	
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
