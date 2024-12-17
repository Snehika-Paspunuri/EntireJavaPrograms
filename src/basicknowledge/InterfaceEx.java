package basicknowledge;
interface Keyboard
{
	void login();

	}
public class InterfaceEx implements Keyboard{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 InterfaceEx x1= new InterfaceEx();
 x1.login();
		 
	}
public void login()
{
	System.out.println("I am a interface login");}
}
