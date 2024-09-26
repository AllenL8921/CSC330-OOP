import java.awt.Color;

public class Triangle extends Shape{
	
	private double base, height;
	
	public Triangle() {
		base = 0;
		height = 0;
	}
	
	public Triangle(Color c, double b, double h) {
		super(c);
		base = b;
		height = h;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return (base * height)/2;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		
		System.out.println("Triangle is a 2D shape and has no volume.");
		return -1;
	}



	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}

}
