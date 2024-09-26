import java.util.ArrayList;

public abstract class Pokemon {
	String type;
	String name;
	ArrayList<Attack> attackList;
	int hitPoints;
	int powerPoints;
	int speed;
	
	//Constructor for pokemon
	public Pokemon(String type, String name, ArrayList<Attack> attackList, int hitPoints, int powerPoints, int speed) {
		this.type = type;
		this.name = name;
		this.attackList = attackList;
		this.hitPoints = hitPoints;
		this.powerPoints = powerPoints;
		this.speed = speed;
	}
	
	public abstract void attack(Pokemon other, int attackIndex);
	public abstract void speak();	
}
