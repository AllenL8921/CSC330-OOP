
public class Plane extends Vehicle{
	
	private double altitude;
	
	public Plane() {
		setAltitude(0);
	}
	
	public Plane(double s, double a) {
		super(s);
		//setSpeed(s);
		setAltitude(a);
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	//override move
	public void move() {
		System.out.println("I am a Plane moving at " + getSpeed() + "m/s at an altitude of " + altitude);
	}
}
