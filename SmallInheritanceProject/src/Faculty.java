
public class Faculty extends UEmployee {
	private String departmentName;

	public Faculty() {
		setDepartmentName("John Smith");
	}
	
	public Faculty(String n, Double s, String dn) {
		super(n, s);
		setDepartmentName(dn);
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String toString() {
		String str = " ";
		str = "Name: " + getName() + "\n" + "Salary: " + getSalary() + "\n" + "Department Name: " + departmentName + "\n";
		
		return str;
		
	}
	
	
}
