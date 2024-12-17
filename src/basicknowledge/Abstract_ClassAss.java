package basicknowledge;
class Amazon_Auth1
{
void login_button()
{
	System.out.println("I am login button");
	}
void click_button()
{
	System.out.println("I am click button");}
}
abstract class Amazon_login extends Amazon_Auth1
{
	abstract void un();
	abstract void un_mob();
	static void loginwith_mobile()
	{
		System.out.println("I am login with mobile");
	}
	void loginwith_email()
	{
		System.out.println("I am login with email");
	}
	}
public class Abstract_ClassAss extends Amazon_login {
	
	void registration_button()
	{
		System.out.println("I am registration button");
	}
void signup_button()
{
	System.out.println("I am signup button");}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Abstract_ClassAss a1=new Abstract_ClassAss();
		a1.click_button();
		a1.login_button();
		a1.registration_button();
		a1.signup_button();
		loginwith_mobile();
		a1.un();
		a1.un_mob();
		a1.loginwith_email();
	}
	@Override
	void un() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am abstract user name");
	} 
	@Override
	void un_mob() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am abstract mobile user name");
	}

}
