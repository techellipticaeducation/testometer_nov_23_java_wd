package testometer_nov_23_java_wd;

public class CharDemo {
	
	public static void m1() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		// ASCII Code - 1 byte (keyboard) 1 byte (127)
		// Unicode = 2 byte	     (2 power 15   - 1) // 32.5K
		// Java
		
		// char -> int
//		char c1 = 'J';
//		int jk = (int)c1;
//		System.out.println(jk);
		
		
		// int to char
//		int m1 = 127;
//		char ck = (char)m1;
//		System.out.println(ck);
		
		char c1 = '\u0938';
		char c2 = '\u0941';
		char c3 = '\u093F';
		char c4 = '\u092E';
		char c5 = '\u0924';
		
		System.out.println(c1+""+c2+""+c4+""+c3+""+c5);
		
		// Unicode
	}
}
