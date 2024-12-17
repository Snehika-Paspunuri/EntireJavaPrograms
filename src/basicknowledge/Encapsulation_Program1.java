package basicknowledge;
class Api_program
{
	private int age=18;
	private String un="contact@gmail.com";
	private String pwd="grotechmind+";
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
	public String getpwd()
	{
		return pwd;
	}
	private void setpwd(String pwd)
	{
		this.pwd=pwd;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
			}
public class Encapsulation_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Api_program a1= new Api_program();
		a1.setAge(78);
		System.out.println(a1.getAge());
a1.setUn("snehika.tumma@gmail.com");
System.out.println(a1.getUn());


	}

}
