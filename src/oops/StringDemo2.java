package oops;

public class StringDemo2 {
	public static void main(String[] args) {
		
		String s1 = "Java"; // Letral way of string creation
		String s2 = "Java";
		
		String s3 = new String("Java"); //Object way
		String s4 = new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		s3 = s3.intern();
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
		//  equality based on value
		// .equals
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		
		
	}
}
