import java.awt.Color;

public class PolarBear extends Bear {
	
	private double clawLength;
	
	public PolarBear() {
		super(Color.WHITE);
		clawLength = 1;
	}
	
	public PolarBear(double cl) {
		super(Color.white);
		clawLength = cl;
	}
	
	public void move() {
		System.out.println("Polar bear is swimming near the glaciers.");
	}
}
