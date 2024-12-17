package basicknowledge;

public class AcessSpecifierEx {
	
		public void add()
		{
			int a=10;
			int b=12;
			int c=a+b;
			System.out.println(c);
		}
		private void sub()
		{
			int x=100;
			int y=20;
			int z=x-y;
			System.out.println(z);
		}
	protected void mul()
	{
		int m=24;
		int n=20;
		int o=m*n;
		System.out.println(o);
		
	}
	void div()
	{
		System.out.println("I am div");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AcessSpecifierEx s1=new AcessSpecifierEx();
s1.add();
s1.div();
s1.sub();
s1.mul();
	}

}
