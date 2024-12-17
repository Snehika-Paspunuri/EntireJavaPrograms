package basicknowledge;
class Grandparent
{
static void add()
{
	System.out.println("I am grandparent method");}
}
class Parent2 extends Grandparent
{
	static void sub()
	{
		System.out.println("I am parent method");
	}}
public class Multilevel extends Parent2{
static void mul()
{
	System.out.println("I am child method");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   add();
   sub();
   mul();
	}

}
