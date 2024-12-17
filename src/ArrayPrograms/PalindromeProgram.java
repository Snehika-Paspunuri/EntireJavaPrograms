package ArrayPrograms;

public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="snehika";
String reverse="";
for(int i=input.length()-1;i>=0;i--)
{
	char op=     input.charAt(i);
	reverse=reverse+op;
	}
System.out.println(reverse);

if(input.equals(reverse))
{
	System.out.println("It is palindrome");}
else
{
	System.out.println("It is not palindrome");}
	}

}
