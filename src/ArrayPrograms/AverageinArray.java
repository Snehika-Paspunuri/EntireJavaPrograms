package ArrayPrograms;

public class AverageinArray {
static double average=0;
static int sum=0;
static int reminder;
static double sum1;
static double average1;
static double reminder1;
static double sum2;
static double average2;
static double reminder2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number[]=new int[4];
number[0]=14;
number[1]=34;
number[2]=90;
number[3]=57;
double number1[]=new double[4];
number1[0]=98.39;
number1[1]=80.32;
number1[2]=23.09;
number1[3]=46.94;
for(int i=0;i<number.length;i++)
{
	sum=sum+number[i];
	average=sum/number.length;
	reminder=sum%(number.length);
	}
for(int i=0;i<number.length;i++)
{
	sum1=sum1+number[i];
	average1=sum1/number.length;
	reminder1=sum1%(number.length);}

sum2=sum1+sum2;
average2=(sum+sum1)/number.length;
reminder2=(sum1+sum2)%(number.length);
System.out.println("Average is:" +average);
System.out.println("Sum is:" +sum);
System.out.println("Reminder is:"+reminder);

System.out.println("=========");

System.out.println("Average is:" +average1);
System.out.println("Sum is:" +sum1);
System.out.println("Reminder is:"+reminder1);

System.out.println("==========");

sum2=sum1+sum2;
average2=(sum+sum1)/number.length;
reminder2=(sum1+sum2)%(number.length);

System.out.println("Average is:" +average2);
System.out.println("Sum is:" +sum2);
System.out.println("Reminder is:"+reminder2);

	}

}
