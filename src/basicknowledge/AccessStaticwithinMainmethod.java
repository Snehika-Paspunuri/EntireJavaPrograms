package basicknowledge;

public class AccessStaticwithinMainmethod {
	public static void sub() {
		System.out.println("I am sub method");
	}
	public static void main(String[] args) {
		sub();
		add();
		System.out.println("I am main method");
		add();
		sub();
		add();
		
	}
public static void add() {
	System.out.println("I am add method");
	
}
}
