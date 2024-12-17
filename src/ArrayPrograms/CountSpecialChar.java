package ArrayPrograms;

public class CountSpecialChar {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="$nehik@";
int specialcharcount=0;

for(int i=0;i<name.length();i++) 
{
char c=name.charAt(i);
if(!Character.isLetterOrDigit(c))
{
	specialcharcount++;
	}

}
System.out.println("No. of special character: " +specialcharcount);
	}

}
