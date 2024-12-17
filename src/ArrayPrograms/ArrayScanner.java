package ArrayPrograms;
import java.util.Scanner;
public class ArrayScanner {
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);
	int rollno[]=new int[4];
	for(int i=0;i<=3;i++)
	{
		System.out.println("Enter the array->" +i);
		rollno[i]=    s1.nextInt();
		System.out.println("  "+ rollno[i]);
 
	}
	/*rollno[0]=     s1.nextInt();
	rollno[1]=     s1.nextInt();
	rollno[2]=     s1.nextInt();
	System.out.println(rollno[0]);
	System.out.println(rollno[1]);
System.out.println(rollno[2]); */ // this is repeating code so instead  
}
}
