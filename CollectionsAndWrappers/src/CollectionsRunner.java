import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsRunner {

	public static void main(String[] args) {
		//1-D arrays!
		//arrays are of static size.
		//You need to know how much data you have before you
		//instantiate it.
		int[] myNums = new int[5];
		System.out.println(myNums);
		
		//Random numbers!
		//Java - Math.random();
		//Math.random() returns a double in the range [0.0,1.0)
		//to make it make sense:
		//cast to ints
		//exclusive on upper bound
		//int value = (int)(Math.random() * (max-min)) + min;
		//include on upper bound
		//int value = (int)(Math.random() * (max-min+1)) + min;
		//If I want a d6 roll (die)
		int dieRoll = (int)(Math.random() * 6)+1;
		System.out.println(dieRoll);
		
		//Assign values
		for(int i = 0; i < myNums.length; i++) {
			myNums[i] = (int)(Math.random() * 100)+1;
		}
		
		//Java has "enhanced" for loops
		//used to iterate through any collection from start to
		//end WITH NO CONTROL OVER AN INDEX!!!
		//YOU CANNOT MAKE CHANGES TO A COLLECTION USING AN 
		//ENHANCED FOR LOOP
		//for(<data type> identifier : collection name)
		for(int num : myNums) {
			System.out.println(num);
		}
		
		//What if you didn't know your data size? 
		//Using an array is wasteful (memory)
		//Uses generics
		//generics cannot be primitives.
		
		//Wrapper classes!
		//They exist for all primitives
		//The data type whole word with a capital letter
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		//Integer myNotPrimitiveInt = new Integer(10);
		
		//1) How do we add items to a List?
		// use the .add method!
		//Auto-boxing - Java will see you pass in an int and
		//will create an Integer object for you.
		myList.add(7);
		myList.add(2342);
		myList.add(-357);
		myList.add(23);
		myList.add(25432);
		
		//Nice: toString is defined for Lists
		System.out.println(myList);
		
		//2) Can you insert a number?
		//method is called add(int index, Object o)
		myList.add(2, 999999);
		myList.add(2, 999999);
		myList.add(2, 999999);
		System.out.println(myList);
		
		//3) How many items?
		//.size()
		System.out.println("How many items: " + myList.size());
		
		//4) .contains(Object o)
		System.out.println(myList.contains(2342));
		
		//5) Removal (tricky)
		//method: .remove
		//Let's remove all of the 999999s
		for(int i = 0; i < myList.size(); i++) {
			if (myList.get(i) == 999999) {
				myList.remove(i);
				i--; //:)  force a -- to counteract the ++
			}
		}
		
		//Also: Go backwards
		for(int i = myList.size()-1; i >= 0; i--) {
			if (myList.get(i) == 999999) {
				myList.remove(i);				
			}
		}
		System.out.println(myList);
		
		//Have you ever wanted to have an array but not index
		//using integers!
		//Hoo boy! Do I have the data type for you!
		//HashMap<K, V>
		//K = key (what you are indexing on)
		//V = value
		//**** HASHMAPS ARE NOT SORTED ***/
		HashMap<String, Song> myMap = new HashMap<String, Song>();
		//put things into HashMaps
		Song s = new Song("Happy Birthday", "Unknown", 30, 1.00);
		myMap.put(s.getTitle(), s);
		
		
		
		
		
	}
	
}