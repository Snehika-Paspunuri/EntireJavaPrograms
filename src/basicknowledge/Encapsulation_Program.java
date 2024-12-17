package basicknowledge;

class Amazon_Application
{
	private String un="contact@grotechmind.com";
	
public String getUn() {
	return un;
}
public void setUn(String un)
{
	this.un=un;}
}
public class Encapsulation_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Amazon_Application a1=new Amazon_Application();
a1.setUn("nisha.snehika@gmail.com");
System.out.println(a1.getUn());


	}

}

