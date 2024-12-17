package basicknowledge;

class StudentClass
{
 StudentClass(int a)	
  {
  System.out.println("Student constructor");	
  }
}

public class InvokingConstructor {
InvokingConstructor()
{
	System.out.println("Invoking constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new StudentClass(9);
new InvokingConstructor();
	}

}
