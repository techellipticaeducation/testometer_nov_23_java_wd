package exceptionhandling;

import java.io.File;
import java.io.FileReader;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(new File("C://text.txt"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
// throws 
