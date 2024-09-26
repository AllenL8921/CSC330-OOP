import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class ReadingFromFiles {
	
	public static void main(String[] args) {
		//reading from Files time!
		//When reading from a file in Java, you must make sure
		//a run time error is not thrown
		//In Java, run-time errors are called Exceptions
		
		ArrayList<Datum> list = new ArrayList<Datum>();
		HashMap<String, Datum> map = new HashMap<String, Datum>();
		
		try {
			Scanner input = new Scanner(new File("C:\\Users\\oshiw\\OneDrive\\Documents\\data.txt"));
			//read!
			while(input.hasNext()) {
				int num = input.nextInt();
				String word = input.next();
				double dub = input.nextDouble();
				Datum dat = new Datum(num, word, dub);
				list.add(dat);
				//key is the word in the datum but lower case
				map.put(dat.getWord().toLowerCase(), dat);
				
			}
			input.close();
		}catch(Exception e) {
			System.out.println("Oops! Something awful has happened!!");
			e.printStackTrace();
		}
		System.out.println("Done!");
		System.out.println(list);
		
		//Get from map!!
		
		Datum real = map.get("keyboard");
		System.out.println(real.getDec());
		
		Datum gimme = map.get("lower");
		if(gimme != null) System.out.println(gimme);
		else System.out.println("No entry with key lower is in the map");
		
		//Your lab:
		double average;
		double sum = 0.0;
		String sentence = "";
			for(Datum d: list) {
				//Let's get each project from the map
				//Let's get the average of all the doubles
				Datum fromMap = map.get(d.getWord().toLowerCase());
				//It should not be null  because we are reading our keys
				//from a list that exists WITH the keys!
				sum += fromMap.getDec();
				sentence += fromMap.getWord() + " ";
			}
			average = sum/list.size();
					System.out.println("The average of all doubles in the map is: " + average);
					System.out.println(sentence);
;	}
	
}
