package basicknowledge;
class Method_Parent
{
	void login() //if made final then can't be overriden. 
	{
		System.out.println("Login with mobile number");
	}}
public class MethodOverriding extends Method_Parent {
	
		void login()
		{
			System.out.println("login with email");
			super.login();// to call parent class  , super keyword can't be used in static method.
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MethodOverriding m1=new MethodOverriding();
   m1.login();
	}

	}
