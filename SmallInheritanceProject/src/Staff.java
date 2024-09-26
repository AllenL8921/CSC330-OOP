
public class Staff extends UEmployee {
	private String jobTitle;
	
	public Staff() {
		setJobTitle("Unemployed");
	}
	
	public Staff(String n, Double s, String jt) {
		super(n, s);
		setJobTitle(jt);
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		String str = " ";
		str = "Name: " + getName() + "\n" + "Salary: " + getSalary() + "\n" + "Job Title: " + jobTitle + "\n";
		
		return str;
		
	}
	
}
