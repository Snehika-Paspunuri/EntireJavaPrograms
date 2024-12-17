package basicknowledge;

public class MethodOverloading {
	MethodOverloading()
	{
		System.out.println("I am constructor");
	}
void add()
{
System.out.println("I am not loaded");	
}
void add(int a)
{
System.out.println("I am loaded method");	
}
static void add(double a)
{
System.out.println("I am loaded static method");	
}
void add(int a, int b, int c, int d)
{
System.out.println(a+b+c+d);	
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
add(0.09);
MethodOverloading m1= new MethodOverloading(); 
m1.add(1);
m1.add();
m1.add(12,13, 45, 67);
	}

}
