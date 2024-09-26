import java.awt.Color;

public class MathTest {
	
	private static int numShapes = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] myShapes = new Shape[numShapes];
		//In reality I would generate 5 random shapes
		
		Shape shape1 = new Square(Color.RED, 5);
		Shape shape2 = new Cylinder(Color.DARK_GRAY, 45.7, 7.6);
		Shape shape3 = new Torus(Color.BLUE, 3.5, 2.5);
		Shape shape4 = new Triangle(Color.cyan, 3, 4);
		//Shape shape5 = new Shape(Color.GRAY);
		//^^^ NO NO NO! Cannot instantiate a Shape object
		
		Shape shape5 = new Square(new Color(125, 125, 50), 19);
		
		myShapes[0] = shape1;
		myShapes[1] = shape2;
		myShapes[2] = shape3;
		myShapes[3] = shape4;
		myShapes[4] = shape5;

		//If you were making a geometry exam:
		//pick a shape
		Shape selected = myShapes[(int)(Math.random() * numShapes)];
		//Then it gets gross (I WOULD NOT REALLY DO IT THIS WAY
		
		if(selected instanceof Square) {
			Square mySquare = (Square)selected; //cast selected to a square object
			System.out.println("What is the area of a square with a side of " + mySquare.getSide());
		}//else if(selected instanceof ) ew...
		
		//For better understanding and how this works:
		
		for(Shape Shapies : myShapes) {
			System.out.println("The area of this shape " + Shapies.getArea());
			System.out.println("The volume of this shape: " + Shapies.getVolume());
		}
		

	}

}
