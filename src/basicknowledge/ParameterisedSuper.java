package basicknowledge;
class Parent_Clss
{
	Parent_Clss(int a, int b)
	{
		System.out.println("I am Parent conctructor");
	}
}
class Child_Clss extends Parent_Clss
{
	Child_Clss(int a)
	{
		super(100, 100);
		System.out.println("I am child constructor");
	}}
public class ParameterisedSuper extends Child_Clss {
	ParameterisedSuper()
	{
		super(20);
		System.out.println("I am main constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ParameterisedSuper();
	}

}
