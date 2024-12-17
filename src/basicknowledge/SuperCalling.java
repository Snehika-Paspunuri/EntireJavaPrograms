 package basicknowledge;
class College
{
	College(){
		System.out.println("I am college constructor");
	}
	College(String College_name)
	{
		System.out.println("I am parameterised college constructor");
	}
	}
class School extends College
{
	School()
	{
		System.out.println("I am school cpnstructor");
	}
	School(int a, String b, double c)
	{
		super("NMREC college");
		System.out.println("I am parameterise school constructor");
	}}

public class SuperCalling extends School  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//School a1=new School();
		SuperCalling s1= new SuperCalling();
		School s2=new School(100, "Ram", 7464);
	}

}
