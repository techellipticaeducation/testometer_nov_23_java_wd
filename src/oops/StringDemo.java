package oops;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = "Java"; // Java = 1
		String s2 = "C#";   // Java, C# = 2
		String s3 = "Java"; // Java, C# = 2
		String s4 = "Python"; // Java, C#, Python = 3
		s3 = "Perl";      // Java, C#, Python, Perl = 4
		s3 = "Python"; //noGC -  Java, C#, Python, Perl = 4
		// after GC - Java, C#, Python = 3
		
		// once you create an array , 
		// we cannot increase or decrease it
		
		// string is array of characters
		checkCharacterOccurance(s1,'a');
		checkCharacterOccurance(s2,'C');
		checkCharacterOccurance(s3,'h');
		checkCharacterOccurance(s4,'h');
		
	}
	
	static void checkCharacterOccurance(String checkStr, char ch) {
		char[] strAr = checkStr.toCharArray();
		int counter = 0;
		for(char c : strAr) {
			if(c == ch) {
				counter++;
			}
		}
		System.out.println("in "+ checkStr + " ,  "+ ch+ " found " + counter + " times");
	}
}
