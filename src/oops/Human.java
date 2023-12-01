package oops;

public class Human {

	String name;
	int age;
	String country;
	
	void talk(String content) {
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
