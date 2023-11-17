package testometer_nov_23_java_wd;

public class JumpStatementDemo {
	public static void main(String[] args) {

		// break - stop your loop execution
		// continue - skip iteration

		for(int i = 1 ; i <= 10 ; i++) {    // 10 iterations
			System.out.println(i + " part1");
			if(i == 6) {
				continue;
			}
			System.out.println(i + " part2");		
		}
		
		
	}
}
