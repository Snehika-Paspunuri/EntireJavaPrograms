package basicknowledge;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);


try
{
	int n1=s1.nextInt();
	String name[]=new String[n1];
	name[0]="ram";
	name[1]="sita";
	name[2]="Laxman";
	name[3]="Shiva";
	System.out.println(n1);
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


