package basicknowledge;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
try
{
	int age=   s1.nextInt();
	System.out.println(age);
	}
catch(InputMismatchException a1)
{
	System.out.println("Handed the exception");}
catch(NullPointerException a1)
{
	System.out.println("Handed the exception1");}
catch(IndexOutOfBoundsException a3)
{
	System.out.println("Handed teh exception 2");}
}
}
