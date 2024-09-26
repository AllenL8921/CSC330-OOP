
public class Pigeon extends Animal {

	private double beakSize;
	
	public Pigeon() {
		setBeakSize(2);
	}
	
	public Pigeon(double bs) {
		setBeakSize(bs);
	}
	
	public void move() {
		System.out.println("Pigeon majestically flies through the azure sky.");
	}

	public double getBeakSize() {
		return beakSize;
	}

	public void setBeakSize(double beakSize) {
		this.beakSize = beakSize;
	}
	
}
