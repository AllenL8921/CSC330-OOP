//IN JAVA, YOU CAN ONLY HAVE ONE PARENT CLASS

public class Vehicle {
	private double speed;
	
	public Vehicle() {
		speed = 0;
	}
	
	public Vehicle(double s) {
		speed = s;	
	}
	
	public void move() {
		System.out.println("I am a Vehicle and I am moving with a speed of " + speed + "m/s");
	}
	
	public double getSpeed() {
		return speed;
		
	}
	
	public void setSpeed(double s) {
		speed = s;
	}
	
	
}
