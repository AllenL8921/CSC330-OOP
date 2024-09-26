public class Temperature {
private double ftemp;

/**
 * Constructor that initializes an instance of an object of the ftemp number passed in by the user
 * @param ftemp
 */
public Temperature(double ftemp) {
	this.ftemp = ftemp;
}

/**
 * Sets the ftemp of the object to the temperature set by the user
 * @param ftemp
 */
void setFahrenheit(double ftemp) {
	this.ftemp = ftemp;
}

/**
 * Returns the value of ftemp
 * @return ftemp
 */
public double getFahrenheit() {
	return ftemp;
}

/**
 * Converts fahrenheit to celsius
 * @return celsius
 */
public double getCelsius() {
	double celsius = (5/9.0) * (this.ftemp - 32);
	return celsius;
}

/**
 * Converts fahrenheit to kevlin
 * @return 
 */
public double getKelvin() {
	return getCelsius() + 273;
}

}
