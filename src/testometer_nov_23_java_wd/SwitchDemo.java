package testometer_nov_23_java_wd;

public class SwitchDemo {
	public static void main(String[] args) {

		// based on day name , provide me day number

		// Monday, Mon = 1
		// Tuesday,Tue = 2
		// Wednesday,Wed = 3
		// Thursday,Thu = 4
		// Friday,Fri = 5 
		// Saturday,Sat = 6
		// Sunday, Sun = 7

		String dayName = "sdafdfas";
		int dayNumber = 0;
		
		// Switch  Case (only compare equality)

		switch (dayName) {
			case "Monday":
			case "Mon":
				dayNumber = 1;
				break;
			case "Tuesday":
			case "Tue":
				dayNumber = 2;
				break;
			case "Wednesday":
			case "Wed":
				dayNumber = 3;
				break;
			case "Thursday":
			case "Thu":
				dayNumber = 4;
				break;
			case "Friday":
			case "Fri":
				dayNumber = 5;
				break;
			case "Saturday":
			case "Sat":
				dayNumber = 6;
				break;
			case "Sunday":
			case "Sun":
				dayNumber = 7;
				break;
		default:
			dayNumber = -1;
			break;
		}
		System.out.println(dayName +  " - " +dayNumber );
	}
}
