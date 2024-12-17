package basicknowledge;

public class Constructor {
	Constructor()
	{
		System.out.println("Constructor1");
	}
	void add()
	{
		System.out.println("Non static method");
	}
	
	public static void sub() {
		System.out.println("Static method");
	}
	
public static void main(String[] args) {
	 
	Constructor a1=new Constructor();
	a1.add();
	sub();
}
}
