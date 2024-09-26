
public class Student {
	private String lastName;
	private String firstName;
	private double average;
	
	/**
	 * returns the average of the student
	 * @return
	 */
	public double getAverage() {
		return average;
	}
	
	/**
	 * sets the average for the student
	 * @param average
	 */
	public void setAverage(double average) {
		this.average = average;
	}
	
	/**
	 * gets the last name of the student
	 * @return
	 */
	public String getLN() {
		return lastName;
	}
	
	/**
	 * gets the first name of the student
	 * @return
	 */
	
	public String getFN() {
		return firstName;
	}
	
	public Student() {
		lastName = "Doe";
		firstName = "John";
		average = 0.0;
	}
	
	public Student(String first, String last) {
		lastName = last;
		firstName = first;
		average = 0.0;
	}
}
