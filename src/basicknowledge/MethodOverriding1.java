package basicknowledge;
class parent4
{
	void add()
	{
		System.out.println("Addition");
	}}

public class MethodOverriding1 extends parent4 {
	void add()
	{
		System.out.println("Substraction");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MethodOverriding1 m1=new MethodOverriding1();
//m1.add();
parent4 n2=new parent4();
n2.add();

	}

}
