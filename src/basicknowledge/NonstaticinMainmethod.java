package basicknowledge;

public class NonstaticinMainmethod {
	void add()
	{
		int a=10;
		int b=200;
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		NonstaticinMainmethod n1= new NonstaticinMainmethod();
		System.out.println("Main method execution");
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
		n1.mod();
	}
	void sub()
	{
		int x=98;
		int y=34;
		int z=x-y;
		System.out.println(z);
		
	}
	void mul()
	{
		int a=90;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	void div()
{
	int j=13;
	int k=2;
	int l=j/k;
	System.out.println(l);
}
	void mod()
	{
		int c=9;
		int d=3;
		int f=c%d;
		System.out.println(f);
	}
}