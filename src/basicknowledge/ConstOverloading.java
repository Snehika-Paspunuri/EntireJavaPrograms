package basicknowledge;

public class ConstOverloading {
ConstOverloading()
{
System.out.println("I am non parametised");	
}
ConstOverloading(int a)
{
	System.out.println("I am parameterised constructor");
	}
ConstOverloading(int x, double y)
{
	System.out.println("I am loaded Parameterised constructor");
}
ConstOverloading(String a)
{
	System.out.println("I am a string para constructor");
	}
ConstOverloading(int a,  byte d, float e, double f, String g)
{
System.out.println("I am all data type constructor");	
}
public static void main(String[] args) {
	new ConstOverloading();
	new ConstOverloading(1);
	new ConstOverloading(1664742, 7.8756554 );
	new ConstOverloading("Snehika");
	//new ConstOverloading(15745, (byte) 25, 6.8f, 5.87786657867676, "Nisha" );
	new ConstOverloading();
	
}
}

