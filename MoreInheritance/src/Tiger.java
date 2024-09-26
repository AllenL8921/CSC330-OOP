
public class Tiger extends Animal {

	private int numStripes;
	
	public Tiger() {
		numStripes = 1;
	}
	
	public Tiger(int ns) {
		numStripes = ns;
	}
	
	public void move() {
		System.out.println("Tiger runs.");
	}
	
	public void hunt(Animal a) {
		System.out.println("The tiger is hunting an animal! Is it sucessful?");
	}
	
	
}
