import java.awt.Color;

public class Cylinder extends Shape {

	private double radius, height;
	
	public Cylinder() {
		radius = 0;
		height = 0;
	}
	
	public Cylinder(Color c, double r, double h) {
		super(c);
		radius = r;
		height = h;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.println("Cylinder is a 3D shape and does not have an area");
		return 0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius * height;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
}
