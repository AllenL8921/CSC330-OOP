import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * This class shows how we can dynamically read from a File.
 * The size of the WeirdData objects' Lists are not the same.
 * However, we can use some String class methods to allow for
 * multiple sizes of WeirdData internal int Lists.
 * @author richard.weir
 *
 */
public class DynamicDataRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<WeirdData> allData = new ArrayList<WeirdData>();  //ArrayList of my WeirdData objects 
		try {
			Scanner input = new Scanner(new File("C:\\Users\\oshiw\\eclipse-workspace\\MoreDynamicData\\src\\RandomData"));
			while (input.hasNext()) {
				String name = input.next();   //read the name
				String restOfLine = input.nextLine().trim(); //.trim will remove all trailing and leading white space
				//Note: we needed trim() in class! I was getting an Exception trying to change a "" to an int!
				//Split the data on space
				String[] data = restOfLine.split(" ");				
				ArrayList<Integer> numsFromLine = new ArrayList<Integer>();				
				for(String num : data) {
					//All wrapper classes have methods to get their values from Strings
					//parse<DataType>
					//Take the String from the array, turn it into a real int, and put it into a List
					numsFromLine.add(Integer.parseInt(num));  //Double.parseDouble(s)...Boolean.parseBool(s)...
				}
				//Make a WeirdData object
				WeirdData weirdThing = new WeirdData(name, numsFromLine);
				//Throw the object into a List
				allData.add(weirdThing);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Oops");
			e.printStackTrace();
		}
		
		//Prove we read it all in!
		for(WeirdData wd : allData) {
			System.out.println(wd);
		}
		
		//Prove that the numbers ARE ints!
		//Print the average of the data of each WeirdData item:		
		for(WeirdData wd : allData) {
			System.out.println("Name: " + wd.getName() + "\nAverage: " + wd.getAverage());
		}
		
	}

}