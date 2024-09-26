
public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1; //declaring a reference to a Student object
		//WHICH DOES NOT EXIST!
		
		
		//Instantiate Objects
		//Keyword new s
		student1 = new Student();
		System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName() + "\nDebt: $" + student1.getDebt());
		
		Student student2 = new Student("Weir", "Rich", 100000.0);
		System.out.println("Name: " + student2.getFirstName() + " " + student2.getLastName() + "\nDebt: $" + student2.getDebt());
	
		System.out.println("Before Swap:\n");
		System.out.println(student1 + "\n");
		System.out.println(student2);
		swap(student1, student2);
		System.out.println("After Swap:\n");
		System.out.println(student1 + "\n");
		System.out.println(student2);


	}
	//Java is pass by value ALWAYS AND ONLY
	//Pass by value means that data is copied as it enters a method
	//But what is "Student"???
	/*
	 * Does not work - it swaps the local variables but the change does not persist outside of the method.
	 * 
	 * public static void swap(Student first, Student second) {
		Student temp = first;
		first = second;
		second = temp;
	}*/
	
	//THE ONLY WAY TO CHANGE THE VALUE OF ANY OBJECT IN A METHOD IS TO CALL A METHODD THAT MUTATES/CHANGES THE OBJECT'S DATA
	
	public static void swap(Student first, Student second) {
		String tempFirstName = first.getFirstName();
		first.setFirstName(second.getFirstName());
		second.setFirstName(tempFirstName);
		
		String tempLastName = first.getLastName();
		first.setLastName(second.getLastName());
		second.setLastName(tempLastName);
		
		double tempDebt = first.getDebt();
		first.setDebt(second.getDebt());
		second.setDebt(tempDebt);
		
	}
}