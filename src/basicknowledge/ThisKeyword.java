package basicknowledge;

public class ThisKeyword {
int age;
String name;
double salary;
void student_details(int age, String name, double salary)
{
System.out.println("Name of the student is: " +name+ " Age of the student is: " +age+ "  salary of the student is:" +salary );
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword t1=new ThisKeyword();
t1.student_details(31, "Snehika", 7064.44);
System.out.println(t1.age);
System.out.println(t1.name);
System.out.println(t1.salary);
//t1.student_details(31, "Snehika", 7064.44);

	}

}
