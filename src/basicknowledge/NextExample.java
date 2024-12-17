package basicknowledge;
import java.util.*;
public class NextExample {

	static void add()
	{
		Scanner s1=new Scanner(System.in);
		int n1=s1.nextInt();
		int n2=s1.nextInt();
		int sum=n1+n2;
		System.out.println("The sum of two number:  "+sum);
		s1.close();
	}
		static void sub()
		{
			 Scanner s2=new Scanner(System.in);
		int a1=s2.nextInt();
		int a2=s2.nextInt();
		int sub=a1-a2;
		System.out.println("The sub of two number:  "+sub);
		s2.close();
		}
		static void mul()
		{
			Scanner s3=new Scanner(System.in);
			int c1=s3.nextInt();
			int c2=s3.nextInt();
			int mul=c1*c2;
			System.out.println("The mul of two number:  "+mul);
			s3.close();
		}
        static void div()
        {
        	Scanner s4=new Scanner(System.in);
        	int v1=s4.nextInt();
        	int v2=s4.nextInt();
        	int div=v1/v2;
        	System.out.println("The div of two numbers: "+div);
        	s4.close();
        }

    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    	
    	
    		add();
    		sub();
    		mul();
    		div();
    		
    	}
	}


