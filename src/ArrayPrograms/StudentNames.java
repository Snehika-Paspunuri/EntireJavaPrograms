package ArrayPrograms;

public class StudentNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]=new String[3];//declare and initialise array
names[0]="Snehika";
names[1]="Eshaan";
names[2]="Eshika";
for(int i=0; i<=2; i++)
{
	System.out.println(names[i]);}

int rollno[]= new int[3];
rollno[0]= 90;
rollno[1]=98;
rollno[2]=53;
System.out.println("Student names " +"Roll no");
for(int i=0;i<3;i++)
{
	System.out.println(names[i]+" "+rollno[i]);}

char gender[]=new char[3];
		gender[0]='F';
gender[1]='M';
gender[2]='M';
System.out.println("Student name"+ "Roll no"+"Gender");
for(int i=0;i<=2;i++)
{
	System.out.println(names[i]+" "+rollno[i]+" "+gender[i]);}

	}
}
