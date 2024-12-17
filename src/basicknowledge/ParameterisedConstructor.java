package basicknowledge;

public class ParameterisedConstructor {
	ParameterisedConstructor() //non parameterised constructor)
	{
		System.out.println("I am non parameterised cobtructor");
	}
	
ParameterisedConstructor(int a)//  parameterised constructor
{
System.out.println("I am parametrised constructor");	
}
public static void main(String[] args) {
	System.out.println("execution begins");
	new ParameterisedConstructor();
	new ParameterisedConstructor(23); // while calling parameter must be passed in object creation.
}
}
