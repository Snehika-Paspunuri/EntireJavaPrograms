package basicknowledge;

public class AssertProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Sita ";
assert name.length()>0;
System.out.println(name.concat("jatin"));

/*String name1="";
assert name1.length()>0:"The length is 0 or less";
System.out.println("jatin");*/


add(100,200);
	}
static void add(int a, int b)
{
	assert a==100;
	int sum=a+b;
	System.out.println(sum);}
		
	

}
