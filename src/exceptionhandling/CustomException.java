package exceptionhandling;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) throws AssignmentNotSubmittedException{
		Scanner scan = new Scanner(System.in);
		System.out.println("did you finish your assignment: ");
		String input = scan.next();
		if(input.equalsIgnoreCase("yes")) {
			System.out.println("very good");
		}else {
			AssignmentNotSubmittedException ex1  = new AssignmentNotSubmittedException("user provide input as " + input);
			throw ex1;
		}		
	}
}
class AssignmentNotSubmittedException extends Exception{
	AssignmentNotSubmittedException(String msg){
		super(msg);
	}
}
