package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
 public static void main(String[] args) {
	
	 
	 // Checked Exception - Compile Time Exception
	 // Runtime Exception 
	Scanner scan = new Scanner(System.in);
	
	while(true) {
		System.out.println("Enter your number: ");
		try {
			// Database connection
			// Query - 
			String input = scan.next();
			int i = Integer.parseInt(input);
			int sqaure = i*i;
			System.out.println("Square : " + sqaure);
		}catch(Exception e) {
			System.out.println("Please try again");
		}finally {
			//	connection close
			System.out.println("Its time for new input");
		}
		
	}
	 
	 
	 
}
}
