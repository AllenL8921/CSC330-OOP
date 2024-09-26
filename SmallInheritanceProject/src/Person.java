
public class Person {
	private String name;
	private String address;
	private String telephone;
	
	public Person() {
		setName("John Smith");
		setAddress("Yodie Land");
		setTelephone("1234567890");
	}
	
	public Person(String n, String a, String t) {
		setName(n);
		setAddress(a);
		setTelephone(t);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
