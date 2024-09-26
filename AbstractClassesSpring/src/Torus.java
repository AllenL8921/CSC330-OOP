import java.awt.Color;

public class Torus extends Shape{
	
	private double outerRadius, innerRadius;

	public Torus(Color c, double d, double e) {
		// TODO Auto-generated constructor stub
		super(c);
		outerRadius = d;
		innerRadius = e;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.println("Undefined.");
		return 0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.pow(Math.PI, 2) * Math.pow(innerRadius, outerRadius);
	}
	
	
	
}
