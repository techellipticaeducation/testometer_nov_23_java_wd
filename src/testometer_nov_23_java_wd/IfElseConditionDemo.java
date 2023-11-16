package testometer_nov_23_java_wd;

import java.util.Scanner;

public class IfElseConditionDemo {
	public static void main(String[] args) {

		// what is age group based on age 
		// 0-18 , child 
		// 18-30 , adult 
		// 30-45 , mature 
		// 45 , old 

		// 0, 17, 18, 19, 29, 30, 31, 44, 45, 46, 60


		System.out.println("Welcome to my Age Calculator");
		while(true) {
			System.out.println("--------------");
			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter your age :");
			int age = scan.nextInt();
			
			if(age == -1) {
				break;
			}
			
			System.out.print("Expected AgeGroup :");
			String expectedAgeGroup = scan.next();
			String ageGroup = "";
			if(age < 18) {
				ageGroup = "Child";
			}else if(age >= 18 && age < 30) {
				ageGroup ="Adult";
			}else if(age >= 30 && age < 45) {
				ageGroup = "Mature";
			}else {
				ageGroup = "Old";
			}
			if(expectedAgeGroup.equals(ageGroup)) {
				System.out.println("Test Passed");
			}else {
				System.err.println("Test Failed. Expected :"+expectedAgeGroup +
						", Actual: "+ageGroup)
				;
			}
			
		}
		
		
	}
}
