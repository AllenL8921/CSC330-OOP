import java.awt.Color;

public class Squirrel implements IEntity {
	
	private Color furColor;
	
	public Squirrel(Color c) {
		furColor = c;
	}

	public Color getColor() {
		return furColor;
	}

	public void setColor(Color color) {
		this.furColor = color;
	}
	
	public void act() {
		System.out.println("Jumping around looking for trouble.");
	}
	

}
