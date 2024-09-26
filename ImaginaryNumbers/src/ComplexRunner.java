public class ComplexRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex obj = new Complex(7, 4);
		Complex obj2 = new Complex(23, -12);

		obj.print();
		//prints original obj
		
		obj.addComplex(obj2);
		obj.print();
		//prints obj after addition
		
		obj.setReal(7);
		obj.setImag(4);
		
		obj.subtractComplex(obj2);
		obj.print();
		//prints obj after subtraction
		
		obj.setReal(7);
		obj.setImag(4);
		
		obj.multiplyComplex(obj2);
		obj.print();
		//prints obj after multiplication
	}
	
}

/*
 * OUTPUT
 *  7.0 + 4.0i
	30.0 - 8.0i
	-16.0 + 16.0i
	209.0 + 8.0i
 */