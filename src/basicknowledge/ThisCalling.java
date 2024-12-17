package basicknowledge;

public class ThisCalling {
ThisCalling()
{
	this(2.145);
	System.out.println("I am Thiscalling constructor");
	
	}
ThisCalling(int a)
{
	System.out.println("I am int parameter constructor");}
ThisCalling(double b)
{
	this(100);
	System.out.println("I am double parameter constructor");}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ThisCalling t1=new ThisCalling(); //individually we can call them by passing parameter but "this" can be used.
	}

}
