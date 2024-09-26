
public class ChatGPTDrivenAI implements IEntity {
	
	private int laserBeamPower;

	public ChatGPTDrivenAI(int lbp){
		setLazerBeamPower(lbp);
	}
	
	public int getLazerBeamPower() {
		return laserBeamPower;
	}

	public void setLazerBeamPower(int lazerBeamPower) {
		this.laserBeamPower = lazerBeamPower;
	}
	
	public void act() {
		System.out.println("Annhilated");
	}
	
}
