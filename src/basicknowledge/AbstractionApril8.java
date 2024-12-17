package basicknowledge;
class Parent_Class1
{
	Parent_Class1()
	{
		System.out.println("I am a constructor");
	}}
class Child_Class extends Parent_Class1
{
	Child_Class()
	{
		//super();
		System.out.println("I am child Constructor");
	}}
public class AbstractionApril8 extends Child_Class{
AbstractionApril8()
{
	//super(); This is present by default
	System.out.println("I am main method constructor");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AbstractionApril8();
	}

}
