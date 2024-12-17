package StringFunctionsAll;

public class StringFunctionVertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="SNEHIKA";
System.out.println(name.isEmpty());
   for(int i=0; i<=name.length()-1;i++ )
   {
	char a1=name.charAt(i);
	System.out.println(a1);
	}
System.out.println("=========");
	for(int i=name.length()-1; i>=0;i--)
	{
		
		char a2= name.charAt(i);
		System.out.println(a2); // if we remove 'ln' we can  get reverse name in single line
	}

	String str="Hello World";
    StringBuilder stringbuilder=new StringBuilder(str);
    stringbuilder.reverse();
    System.out.println("Reversed String:"+ stringbuilder.toString());
    
}
	}
