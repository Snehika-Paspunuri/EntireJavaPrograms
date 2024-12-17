package basicknowledge;
//using global variable do add, sub, mul, div and mod
public class GlobalVariableAssignment {

	int a=10;
	int b=23;
 static int x=10;
 static int y=50;
	
	void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	void mul()
	{
		int d=a*b;
		System.out.println(d);
	}
	static void sub()
	{
		int z=y-x;
		System.out.println(z);
	}
	void mod()
	{
		int e=a%b;
		System.out.println(e);
	}
	static void div()
	{
		int m=x/y;
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GlobalVariableAssignment a1=new GlobalVariableAssignment();
sub();
a1.add();
a1.mul();
a1.mod();
div();
	}

}
