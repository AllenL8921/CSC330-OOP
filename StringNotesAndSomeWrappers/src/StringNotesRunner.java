
public class StringNotesRunner {
	
	//Strings in Java are both good and janky!
	
	public static void main(String[] args) {
		//Two ways of declaring and instantiating:
		
		String word1 = "phone";
		String word2 = new String("phone");
	
		//*** STRINGS IN JAVA ARE IMMUTABLE
		//	---once they are instantiated, they can never change.
		//	You can't go to the char at index 4 and make it a y...
		//	Java will create one instance of a String in memory
		
		//When you are doing checks for String equality
		//BAD:
		// == for objects checks for reference equality.
		// i.e. are these objects in the same memory location!
		
		
		//All objects have a method called .equals
		//For Strings, if I want to check for value equality,
		//I need to use .equals
		
		if(word1.equals(word2)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("They are not equal!");
		}
		
		//Other useful methods.
		//Remember: Indexes in Java start at 0 
		
		//1) .length()
		//	returns the number of symbols in the String
		
		String phrase = "Where is my snow? It is supposed to be winter in the north pole";
		System.out.println("How many symbols is: " + phrase.length());
		
		//2) .substring(int start, int end) - returns the substring of a String
		//	starting at index start and ending at index end (exclusive)
		System.out.println("Symbols 14 through 35: " + phrase.substring(14,25));
		
		//3) .substring(int start) - returns the substring of a String starting at start and going to the end
		System.out.println("Phrase from symbol 6: " + phrase.substring(6));
		
		//4) .charAt(int index) - returns the char at the index
		char letter = phrase.charAt(30);
		System.out.println(letter);
		
		//Let's print all of the symbols vertically:
		for(int i =0; i < phrase.length(); i++) {
			System.out.println(phrase.substring(i+1));
		}
		
		//More interesting:
		//I can "replace" characters
		
		String newString = phrase.replace('e', 'y');
				System.out.println(newString);
				System.out.println(phrase);
				
		//toLowerCase and toUpperCase
				System.out.println(phrase.toUpperCase());
		//I can do
		//phrase = phrase.UpperCase(); //phrase will change
				
		//trim() - returns a new String with any trailing or leading spaces deleted.
		
		String name = " 			Richward Weir			".trim();
		System.out.println(name);
		
		//THIS MAy BE USEFUL FOR LAB!!!
		//.split(String delimiter) - returns 1d array of Strings using the delimiter passed in
		
		String[] words = phrase.split(" ");
		for(String s : words) {
			System.out.print(s + "8");
		}
		
		System.out.println("\n" + words[3]);
		
		/*****************VERY IMPORTANT*********/
		//How do we compare two Strings?
		//.compareTo(Object o)
		//Uses ASCII values to compare the decimal values of each char in a String
		
		String word3 = "zebra";
		String word4 = "aardvarkk";
		System.out.println(word1.compareTo(word4));
		
		
	}

}