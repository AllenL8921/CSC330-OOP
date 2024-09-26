import java.util.ArrayList;

public class Blastoise extends Pokemon {

	public Blastoise(String type, String name, ArrayList<Attack> attackList, int hitPoints, int powerPoints, int speed) {
		super(type, name, attackList, hitPoints, powerPoints, speed);
	}

	@Override
	public void attack(Pokemon other, int attackIndex) {
		// if the attack the pokemon is trying to use has PP, then it will use the move
		double damage = 0;
		
		if(attackList.get(attackIndex).getPowerPoints() > 0) {
			//calculates damage based on the move's type and power
			if(attackList.get(attackIndex).getType().toLowerCase().equals("water") && other.type.toLowerCase().equals("fire")) {
				damage = 2 * (attackList.get(attackIndex).getBaseDamage());
				attackList.get(attackIndex).setPowerPoints(attackList.get(attackIndex).getPowerPoints()- 1);
			}else if(attackList.get(attackIndex).getType().toLowerCase().equals("water") && other.type.toLowerCase().equals("grass")){
				//Not as effective damage
				damage = 0.5 * (attackList.get(attackIndex).getBaseDamage());
			}else {//Neutral damage
				damage = attackList.get(attackIndex).getBaseDamage();
			}
		}
		
		//damage done to the opposing pokemon is printed out
		
		if(other.hitPoints > 0) {
			System.out.println(this.name + " has dealt " + damage + " damage to " + other.name);
			other.hitPoints -= damage;
		}
	}

	public void speak() {
		System.out.println("Glub glub");
	}

}
