import java.util.ArrayList;

/**
 * A WeirdData class that has almost no uses.
 * @author richard.weir
 *
 */
public class WeirdData {

	private ArrayList<Integer> nums;  //ArrayList of nums
	private String name;			  //name of this object
	
	/**
	 * Constructor
	 * @param n the name
	 * @param list List of integers
	 */
	public WeirdData(String n, ArrayList<Integer> list) {
		nums = list;
		name = n;
	}

	/**
	 * Returns the name of the object
	 * @return the name of the object
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns a String representation of this object.
	 * Format is:
	 * Name: <name>
	 * Data: <each int followed by a space>
	 */
	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "Data: ";
		for(int i : nums) {
			s += i + " ";
		}
		s += "\n";
		return s;
	}
	
	/**
	 * Calculates the average of the internal private int ArrayList
	 * @return the average of the ints in the List
	 */
	public double getAverage() {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return (double)sum/nums.size();
	}
	
}