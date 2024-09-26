	
public class Elephant extends Animal {

	private double trunkSize;
	
	public Elephant() {
		trunkSize = 464;
	}
	
	public Elephant(double tl) {
		trunkSize = tl;
	}
	
	public void move(){
		System.out.println("Elephant gracefully stomps about the savannah.");
	}
	
	public void graze() {
		System.out.println("Nom nom nom.");
	}
	
}
