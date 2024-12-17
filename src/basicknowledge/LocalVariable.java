package basicknowledge;

public class LocalVariable {
static void add()
 {
int a=10;
a=30;
int b=20;
System.out.println(a+b);
 }

void add(int a, int b)
{
a=35;
b=90;
b=100;
int c=a+b;
System.out.println(c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1000;
a=20;
System.out.println(a);
		add();
LocalVariable a1=new LocalVariable();
a1.add(1, 2);
	}

}
