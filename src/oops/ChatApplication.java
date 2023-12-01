package oops;


public class ChatApplication {
	public static void main(String[] args) {
		// How to create object of a class
		
		Human h1 = new Human();
		h1.name = "Ram";
		h1.age = 17;
		
		
		Human h2 = new Human();
		h2.name = "Shyam";
		h2.age = 24;
		
		
		h1.talk("Hello");
		h2.talk("Hi. I am good.");
		System.out.println(h1.age);
		h1.happybirthday();
		System.out.println(h1.age);
		
		// 1000 
		// age = 1000
		// country = 1000
		// concept of instance and static variable
		// 15 object 
		
	}
}
