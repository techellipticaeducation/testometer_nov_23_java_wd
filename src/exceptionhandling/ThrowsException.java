package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException {

	public static void main(String[] args) {
		try {
		readFile();
		}catch(FileNotFoundException e) {
			System.out.println("this is fle not exception");
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("this is fle not exception");
		}catch(Exception e) {
			System.out.println("common msg");
		}
	}
	
	
	
	// Apache automation framework 
	public static void readFile()throws FileNotFoundException, ArrayIndexOutOfBoundsException {
			FileReader fr = new FileReader(new File("C://text.txt"));
	}
	
	public static int devide(int i, int j) {
		return i/j;
	}
	
}
