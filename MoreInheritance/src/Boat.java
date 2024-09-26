
public class Boat extends Vehicle{

	
	 private double sailLength;
	 
	 public Boat() {
		 setSailLength(1);
	 }
	 
	 public Boat(double s, double sl) {
		 super(s);
		 setSailLength(sl);
	 }

	public double getSailLength() {
		return sailLength;
	}

	public void setSailLength(double sailLength) {
		this.sailLength = sailLength;
	}
	 
	public void move() {
		System.out.println("I am a Boat moving at " + getSpeed() + "m/s and my sail has a length of " + sailLength);
	}
	
}
