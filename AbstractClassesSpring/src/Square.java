import java.awt.Color;

public class Square extends Shape {

	private double side;
	
	public Square() {
		side = 0;
	}
	
	public Square(Color c, double side) {
		super(c);
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return side * side; // Math.pow(side, 2);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		System.out.println("This 2D shape can not reurn a volume.");
		
		return -1;
	}
	
	public double getSide() {
		return side;
	}
	
	

}
