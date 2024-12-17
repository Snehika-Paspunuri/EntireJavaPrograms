package basicknowledge;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
try {
	int age=s1.nextInt();
	System.out.println(age);
	
}
catch(InputMismatchException a1)
{
	System.out.println("Exception handled");
	}
finally
{
	System.out.println("Thanks for visiting come again");}
	}

}
