import java.util.Random;

public class ComputerPlayer extends Player {

	public ComputerPlayer(Pokemon p, Item item) {
		super(p, item);
	}

	public void run(Player otherTrainer) {
		int max = super.getPoke().attackList.size() -1;
		int min = 0;
		
		//Randomly generate an attackindex based on the attackList's size
		int attackIndex = (int) Math.floor(Math.random() * (max - min + 1) + min);
				
		//the computer will use their healing item when their pokemon's HP falls below a certain threshold
		if((double)super.getPoke().hitPoints/100 < 50/100) {
			super.getItem().use(getPoke());
		}else {
			//Computer chooses an attack
			System.out.println(super.getPoke().name + " chose " + super.getPoke().attackList.get(attackIndex).getAttackName());
			super.getPoke().attack(otherTrainer.getPoke(), attackIndex);
		}
	
	}

}
