package oops;

public class MemoryInJava {
	public static void main(String[] args) {
		// Heap - no arragements

		// you can save your object in heap
		// while you are creating , you have to go through our hash algo
			J1 object1 = new J1();
			object1.test1();
			
			// all those object which do not have ref, are considered as garbage
			// GC - automatic 
			
			object1 = null;
			// manual
			System.gc();
			
			
	}
}


class J1{
	public void test1() {
		System.out.println("Hello");
	}
}

