package basicknowledge;
class Parent1
{
void add()
{
	System.out.println("I am add non static method");
	}
void sub()
{
	System.out.println("I am sub non static method ");}
}
public class Inheritance1 extends Parent1 {
void mul()
{
System.out.println("I am mul non static method");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inheritance1 n1=new Inheritance1();
n1.add();
n1.sub();
n1.mul();
	}

}
