package oops;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] student1 = new int[4];
		student1[0] = 34;
		student1[1] = 36;
		student1[2] = 38;
		student1[3] = 40;
		
		for(int i : student1) {
			System.out.println(i);
		}
		
		// java collection , List, set, map, queue,
		// fastest collection is array
		// Excel sheet is an example 2D array
	}
}
