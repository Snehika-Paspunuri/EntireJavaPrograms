package ArrayPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Equalsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Starting of first Array:->");
Scanner s1=new Scanner(System.in);
int rollno[]=new int[3];
for(int i=0;i<rollno.length;i++)
{
	System.out.println("Enter the Array:->"+i);
	rollno[i]=   s1.nextInt();
	}
System.out.println("Starting of second Array:->");
int rollno1[]=new int[3] ;
for(int i=0;i<rollno1.length;i++)
{
	System.out.println("Enter the Array 2:->"+i);
	rollno1[i]=   s1.nextInt();
	}
System.out.println(Arrays.toString(rollno));
System.out.println(Arrays.toString(rollno1));
if(Arrays.equals(rollno, rollno1)==true)
{
	System.out.println("Hey 2 arrays are same");}
else
{
	System.out.println("Sorry not equal");}

	}

}