/**
 * Abstract classes are classes that are not finished.
 * 
 * They have some fields and functionality (methods) but 
 * it does not make sense to define other methods.
 * There is/are one more more methods that are undefined,
 * BUT listed!
 * 
 * Think of them more like categories of things, rather than 
 * ACTUAL things.
 * 
 * The ACTUAL things in OOP are called CONCRETE classes.
 * 
 * Like interfaces, you cannot instantiate (use new) for the 
 * creation of an abstract class object.
 * 
 * 
 * @author oshiw
 *
 */

import java.awt.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		setColor(color.PINK);
	}
	
	public Shape(Color c) {
		setColor(c);
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	abstract public double getArea();
	abstract public double getVolume();
	
}
