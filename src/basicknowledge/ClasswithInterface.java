package basicknowledge;
interface Interface2
{
	void login();
	void logout();
}
interface Interface1 extends Interface2
{
	void search();
	void payment();
	}
public class ClasswithInterface implements Interface1 
{
void orderpage()
{
	}
static void address_page()
{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClasswithInterface c1=new ClasswithInterface();
c1.login();
c1.logout();
c1.search();
c1.payment();
c1.orderpage();
address_page();
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("I am login");
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("I am logout");
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("I am search");
	}
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("I am payment");
	}

}
