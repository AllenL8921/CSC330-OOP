import java.awt.Color;

public class Bear extends Animal{
	
	private Color color;
	
	public Bear() {
		color = Color.BLACK;
	}
	
	public Bear(Color c) {
		color = c;
	}
	
	public void swim() {
		System.out.println("bear swimming.");
	}
	
	public void move() {
		System.out.println("Bear running through the woods..");
	}
	
	
}
