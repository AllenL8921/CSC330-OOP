//Introduction to Classes

//A class is a file that has both data (fields) and behavior (methods)
public class Student {
	//Classes are written in a conventional way 

	//Fields
	
	//Data hiding - a way by which we do not allow classes
	//(other programs) to access and/modify this class' data. -- data encapsulation
	
	//Keywords for Data accessibility
	// 1) public - never use this EXCEPT (talk about this later) 
	//		ALL FILES CAN SEE AND MODIFY ALLOWS
	// 2) protected - later (inheritance)
	// 3) private - NO other classes can see nor modify the data
	
	private String lastName; //student's last name
	private String firstName; //studen'ts first name 
	private double debt; //sadness - student's debt
	
	//Methods (functions) 
	
	//Constructors - methods that are called ONCE when the instance of the object is created
	//meant to initialize data
	
	//public ClassName(<parameters>*){
	//default constructor - no params
	//*******NOTE*******
	//Java will give default values to fields depending on their type and if YOU don't give them values!
	//		integers = 0
	//		doubles = 0.0
	//		booleans = false
	//		objects = null <---- THIS IS SO BAD!!
	public Student() {
		lastName = "Doe";
		firstName = "Sam";
		debt = 0;
	}
	
	public Student(String lastName, String firstName, double debt) {
		//left hand side MUST be the instance field
		//this is the way in which an object refers to itself
		this.lastName = lastName;
		this.firstName = firstName;
		this.debt = debt;
	}
	
	//Accessor and mutator methods
	//Getters and setters
	
	/**A method that returns the first name of this Student object
	 * @return the first name of the object
	 */
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public double getDebt() {
		return debt;
	}
	
	public void setDebt(double debt) {
		this.debt = debt;
	}
	
	//Method overloading - a class has a method with the same name BUT a different header (different parameter types) 
	public void addDebt(double amt) {
		debt += amt; //debt = debt + amt;
	}
	
	public void addDebt() {
		debt += 100;
	}
	
	//Method returns a String representation of this object
	public String toString() {
		String s = "";
		s += "First Name: " + firstName + "\n";
		s += "Last Name: " + lastName + "\n";
		s += "Debt: $" + debt;
		return s;
	}
	
	public void setFirstName(String fn) {
		firstName = fn;
	}
	
	public void setLastName(String fn) {
		lastName = fn;
	}
	
}