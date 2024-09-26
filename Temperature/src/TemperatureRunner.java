import java.util.Scanner;

public class TemperatureRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter temperature in Fahrenheit: ");
		double ftemp = input.nextDouble();
		
		Temperature temp = new Temperature(ftemp);
		
		System.out.println("Celsius: " + temp.getCelsius());
		System.out.println("Kelvin: " + temp.getKelvin());

		input.close();
	}

}

/*
Enter temperature in Fahrenheit: 
273
Celsius: 133.88888888888889
Kelvin: 406.8888888888889
*/