package oops;


public class ChatApplication {
	public static void main(String[] args) {
		// How to create object of a class
		Human.country = "India";
		
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
		
		
		System.out.println(h1.country);
		
		// India = 5 char , 5 byte * 1000 = 5000 byte / 5 byte
		// 1000 
		// age = 1000
		// country = 1000
		// concept of instance and static variable
		// 15 object 
	
		// static variable - shared
		// out side method
		//	instance variable
		// static variable - shared variables
		// using classname.variablename
		// class variable
		
		
		// with in method - 
		// local variable
		
	}
}
