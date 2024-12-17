package basicknowledge;

public class GlobalVariable1 {
 String name="Snehika";
		 int age=31;
double weight=73.5;

void add(String name,int age,double weight)
{
	System.out.println("Hey my bio data is "+ name + age + weight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GlobalVariable1 g1=new GlobalVariable1();
g1.name="Nisha"; 
System.out.println(g1.name);
System.out.println(g1.age);
g1.add("ram", 51, 87.87);

	}

}
