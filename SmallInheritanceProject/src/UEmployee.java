
public class UEmployee {

	private String name;
	private double salary;
	
	public UEmployee() {
		name = "John Smith";
		salary = 0.0;
	}
	
	public UEmployee(String n, Double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		String str = " ";
		str = "Name: " + name + "\n" + "Salary: " + salary + "\n";
		
		return str;
		
	}
	
}
