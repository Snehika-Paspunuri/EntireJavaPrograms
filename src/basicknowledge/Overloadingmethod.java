package basicknowledge;

public class Overloadingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1");
main("snehika");//calls method with string value in it.

	}
	public static void main()
	{
		System.out.println("2");
	}
public static void main(int a)
{
	System.out.println("3");
	}
public static void main(String name)
{
	System.out.println("4");}
}
