package testometer_nov_23_java_wd;

import java.util.Scanner;

public class IfElseConditionDemo {
	public static void main(String[] args) {

		// what is age group based on age 
		// 0-18 , child 
		// 18-30 , adult 
		// 30-45 , mature 
		// 45 , old 

		System.out.println("Welcome to my Age Calculator");
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your age :");
			int age = scan.nextInt();

			// if elseif

			//	int age = 34;
			// if only allow boolean

			if(age < 18) {
				System.out.println("Child");
			}else if(age >= 18 && age < 30) {
				System.out.println("Adult");
			}else if(age >= 30 && age < 45) {
				System.out.println("Mature");
			}else {
				System.out.println("Old");
			}
	}
}
