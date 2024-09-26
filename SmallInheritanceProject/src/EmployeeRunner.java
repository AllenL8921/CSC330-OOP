
public class EmployeeRunner {
	
	public static void main(String[] args) {
		UEmployee person1 = new UEmployee("John", 70000.0);
		System.out.println(person1);
		
		Faculty person2 = new Faculty("Josh", 80000.0, "Computer Science");
		System.out.println(person2);
		
		Staff person3 = new Staff("Jim", 50000.0, "Janitor");
		System.out.println(person3);
	
	}

}
/*-------OUTPUT
 * Name: John
Salary: 70000.0

Name: Josh
Salary: 80000.0
Department Name: Computer Science

Name: Jim
Salary: 50000.0
Job Title: Janitor


 */