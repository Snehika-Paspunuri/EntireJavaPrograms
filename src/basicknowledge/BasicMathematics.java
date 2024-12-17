package basicknowledge;

public class BasicMathematics {
	
	public static void main(String[] args) {
		System.out.println("Execution start");
		add();
		sub();
		div();
		mul();
		mod();
	}

	public static void add() {
		int a=10;
		int b=20;
		int addition=a+b;
		System.out.println(addition);
	}
		public static void sub() {
			int x=100;
			int y=200;
					int subtraction= y-x;
					System.out.println(subtraction);
					
		} 
		public static void mod() {
			int a=28;
			int b=9;
			float c=a%b;
			System.out.println(c);
			
		}
		public static void div() {
			long a1= 59;
			short  a2=6;
			float a3= a1/a2;
			System.out.println(a3);
		}
		public static void mul() {
			int a=13;
			int b=45;
			int c=a*b;
			System.out.println(c);
			
		}
		
	}
