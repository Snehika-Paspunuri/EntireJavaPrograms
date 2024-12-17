package basicknowledge;

public class ThisCallingEx {
	ThisCallingEx()
	{
		this('A', "Snehika");
		System.out.println("I am non parameter");
	}
	ThisCallingEx(int a)
	{
		System.out.println("I am int constructor");
	}
	ThisCallingEx(double b)
	{
		this(100);
		System.out.println("I am double constructor");
	}
	ThisCallingEx(String a)
	{
		this(3.14);
		System.out.println("I am string constructor");
	}
ThisCallingEx(char a, String b)
{
	this("Nisha");
	System.out.println("I am char and string constructor");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisCallingEx c1=new ThisCallingEx();
	}

}
