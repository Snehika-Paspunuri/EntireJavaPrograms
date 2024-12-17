package basicknowledge;

public class GlobalVariable {
static int age=35;
static String name="Nisha";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(name);
System.out.println(age);
age=12;
name= "Snehika";
System.out.println(age);
System.out.println(name);
name="Sanjay";
System.out.println(name);
add();
	}
static void add()
{
	age=53;
	System.out.println(age);}
}
