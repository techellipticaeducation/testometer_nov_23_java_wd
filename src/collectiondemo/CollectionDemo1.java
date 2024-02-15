package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo1 {
	public static void main(String[] args) {
		// Collection
		// List Set Map
		Scanner scan = new Scanner(System.in);

		Set<Integer> items = new HashSet<Integer>();

		while(true) {
			System.out.println("Enter Your item");
			int itemName = scan.nextInt();
			items.add(itemName);
			System.out.println("Current items in List : " + items.toString());
			if(itemName == 6) {
				break;
			}
		}
		
	}
}
