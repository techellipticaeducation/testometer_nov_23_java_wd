package oops;

public class ArrayDemo {
	public static void main(String[] args) {
		
		// student, 5 subject marks . science, math, arts, english, hindi
		
		//  40 students
		// array with in array
		
		int[] student1 = {10,30,50,60,80}; // 1-D
		
		student1[1] = 67;
		// 5 values 
		// array - we cannot change size of an array
		//System.out.println(student1.length);
//		for(int i = 0 ; i < student1.length ; i++) {
//			System.out.println(student1[i]);
//			if(i == 2) {
//				break;
//			}
//		}
		
		// loop - advanced for loop
//		for( int k  : student1 ) {
//			System.out.println(k);
//		}
		
		
		// index out of bound
		// length = 5
		// array always starts with 0
		// max index (upperbound) = length-1
		
		
		
		
		
		
		// 2D array = array with in array
		// for
		
		
		
		int[][] allStudentMarks = {
				{10,30,50,60,80},
				{40,50,80,20,70},
				{40,10,60,20,30}
		}; // 2D array
//		array with in array
		// 60D
		for( int[] marks  : allStudentMarks ) {
			for(int mark : marks) {
				System.out.println(mark);
			}
		}
		
	}
}
