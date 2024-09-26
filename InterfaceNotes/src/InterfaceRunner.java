import java.awt.Color;

public class InterfaceRunner {

	public static void main(String[] args) {
		Tree myTree = new Tree(49.7, true);
		Squirrel phil = new Squirrel(Color.BLUE);
		ChatGPTDrivenAI bob = new ChatGPTDrivenAI(1000);
		
		myTree.act();
		phil.act();
		bob.act();
		
		//IEntity nononono = new IEntity();
		
		IEntity whatThe = new Tree(100, false);
		whatThe.act();
		
	}
	
}
