import java.awt.Color;

public class Zoo {
	
	public static void main(String[] args) {
	
		Bear myBear = new Bear(Color.PINK);
		PolarBear myPolarBear = new PolarBear(4);
		Animal myAnimal = new Animal();
		Elephant myElephant = new Elephant(10);
		Pigeon myPigeon = new Pigeon(11);
		Tiger myTiger = new Tiger(3);
		
		Animal[] myZoo = new Animal[6];
		myZoo[0] = myBear;
		myZoo[1] = myPolarBear;
		myZoo[2] = myAnimal;
		myZoo[3] = myElephant;
		myZoo[4] = myPigeon;
		myZoo[5] = myTiger;
		
		System.out.println("*************************");
		for(int i = 0; i < myZoo.length; i++) {
			myZoo[i].move();
		}
		System.out.println("*************************");

		myBear.move();
		myPigeon.move();
		myTiger.move();
		
		myTiger.hunt(myElephant);
	}
}
