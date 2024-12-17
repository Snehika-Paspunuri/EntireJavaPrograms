package basicknowledge;

public class ThisKeyword1 {
int age;
String name;
double salary;
void student_details(int age, String name, double salary)
{
	this.age=age;
	this.name=name;
	this.salary=salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword1 k1=new ThisKeyword1();
k1.student_details(90, "Snehika", 948.90);

System.out.println(k1.age);
System.out.println(k1.name);
System.out.println(k1.salary);

	}

}
