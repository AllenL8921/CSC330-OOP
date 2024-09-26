import java.util.ArrayList;

public class PokemonRunner {

	public static void main(String[] args) {
		
		//Creating 
		ArrayList<Attack> charizardAttacks = new ArrayList<Attack>();
		ArrayList<Attack> blastoiseAttacks = new ArrayList<Attack>();
		
		//Creating attacks that will be added to charizard's attack list
		Attack FireBlast = new Attack("FireBlast", "Burn", 15, "fire", 100);
		Attack AirSlash = new Attack("AirSlash", "Sharp Air", 15, "flying", 90);
		Attack DragonClaw = new Attack("DragonClaw", "Roar", 15, "dragon", 90);
		Attack Flamethrower = new Attack("Flamethrower", "A stream of fire", 15, "fire", 100);

		charizardAttacks.add(FireBlast);
		charizardAttacks.add(AirSlash);
		charizardAttacks.add(DragonClaw);
		charizardAttacks.add(Flamethrower);

		//Creating attacks that will be added to blasetoise's attack list

		Attack HydroPump = new Attack("HydroPump", "A strong stream of water", 15, "water", 120);
		Attack SkullBash = new Attack("SkullBash", "Strong skull", 15, "normal", 90);
		Attack Surf = new Attack("Surf", "Surfing so cool", 15, "water", 90);
		Attack Waterfall = new Attack("Waterfall", "Climbing the waterfall", 15, "water", 95);

		
		blastoiseAttacks.add(HydroPump);
		blastoiseAttacks.add(SkullBash);
		blastoiseAttacks.add(Surf);
		blastoiseAttacks.add(Waterfall);
		
		//Creating two Pokemon objects and initializing them with their HP and ATK values
		
		Pokemon pokemon_0006 = new Charizard("fire", "Charmander", charizardAttacks, 266, 155, 100);
		Pokemon pokemon_0009 = new Blastoise("water", "Squirtle", blastoiseAttacks, 268, 153, 78);
		
		//Creating item objects
		
		Item potion = new HealingItem(20);
		Item oranBerry = new HealingItem(10);
		//Creating a HumanPlayer and ComputerPlayer object
		
		Player p1 = new HumanPlayer(pokemon_0006, potion);
		Player c1 = new ComputerPlayer(pokemon_0009, oranBerry);
		
		boolean gameOver = false;
		int turn = 1;
		
		while(!gameOver) {
			System.out.print('\n');
			System.out.println("Turn " + turn);
			System.out.print("\n");
			
			System.out.println("The battle begins!");
			printStatus(p1, c1);
			
			if(p1.getPoke().hitPoints < 0 || c1.getPoke().hitPoints < 0){
				gameOver = true; // once a Pokemon has reached 0 hp, the battle is over
				System.out.println("The battle is over!");
				
				if(p1.getPoke().hitPoints < 0) {
					System.out.println("Player 2 and " + c1.getPoke().name + " have won!");
				}else {
					System.out.println("Player 1 and " + p1.getPoke().name + " have won!");
				}
				break;
			}
			
			if(p1.getPoke().speed > c1.getPoke().speed) {
				//if p1 is faster, p1 will go first
				p1.run(c1);
				c1.run(p1);
			}else if(p1.getPoke().speed == c1.getPoke().speed) {
				//if there is a speed tie, then its going to a 50/50 between which player goes first
				if((int)Math.random() > 0.5) {
					p1.run(c1);
				}else {
					c1.run(p1);
				}
				
			}else {// the second player is faster
				c1.run(c1);
				p1.run(c1);
			}
						
			turn++;
		}// end of while loop
		
	}
	
	public static void printStatus(Player p1, Player c1) {
		
		System.out.println(p1.getPoke().name + ": ");
		for(int i = 0; i < p1.getPoke().hitPoints/10; i++) {
			System.out.print('=');
		}		
		System.out.print(" " + p1.getPoke().hitPoints + "HP");
		
		System.out.print('\n');

		System.out.println(c1.getPoke().name + ": ");

		for(int i = 0; i < c1.getPoke().hitPoints/10; i++) {
			System.out.print('=');
		}
		System.out.print(" " + c1.getPoke().hitPoints + "HP");

		System.out.print('\n');

	}

}


