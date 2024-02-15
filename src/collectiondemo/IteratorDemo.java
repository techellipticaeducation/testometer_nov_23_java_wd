package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("a");
	ls.add("f");
	ls.add("e");
	ls.add("y");
	ls.add("k");
	
	Iterator<String> lsIter = ls.iterator();
	while(lsIter.hasNext()) {
		System.out.println(lsIter.next());
	}
	
	
}
}
