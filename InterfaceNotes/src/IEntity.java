//Interfaces are really just lists of method headers.
//
//THERE ARE NO METHOD DEFINITIONS IN AN INTERFACE
//YOU CAN NOT INSTANTIATE AN INTERFACE "OBJECT"
//.....never use keyword new Interface()

//99.9999% of the time, no data.
//The only data allowed is public static data.

//The keyword for using an interface is IMPLEMENTS

//A class that "implements" an interface is engaging into a contract between 
//the interface and itself
//The agreement is "I will define all methods listed in the interface"

public interface IEntity {
	
	public void act();
	
	
}
