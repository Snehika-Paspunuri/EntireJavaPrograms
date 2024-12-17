package basicknowledge;

class Parent
{
static void add()
{
System.out.println("Parent method");	
}
}
public class Inheritance extends Parent {
	static void sub()
	{
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		sub();
		
	}

}
