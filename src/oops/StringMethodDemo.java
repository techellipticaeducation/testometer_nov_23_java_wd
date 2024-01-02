package oops;

public class StringMethodDemo {
	public static void main(String[] args) {
		String s1 = "I am learning java from tech elliptica";

		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(6));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('e', 7));
		
		String[] splittedArr = s1.split(" ");
		System.out.println("total words :  "+splittedArr.length);
		for(String s : splittedArr) {
			System.out.println(s);
		}
		
		System.out.println(s1.replace("java", "python"));
		System.out.println(s1.length());

		String i = "10";
		i = i + 1;
		System.out.println(i);
		
		// data type to string
		int i1 = 10;
		String i2 = String.valueOf(i1);
		System.out.println(i2);
		
		// string to data type
		// datatype wrapper class
		// byte - Byte
		// short - Short
		// int - Integer
		// long - Long
		// char - Character
		// float - Float
		// double - Double
		// boolean - Boolean
		
		String k1 = "101";
		int k2 = Integer.parseInt(k1);
		System.out.println(++k2);
		
		String m1= "c";
		char[]  ch1 = m1.toCharArray();
		char k4 = ch1[0];
		System.out.println(k4);
		
		
	}
}
