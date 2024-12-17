package ArrayPrograms;

import java.util.Arrays;

public class CountofNumber {
static int countnumeric=0;
	public static void main(String[] args) 
	{

String name="Snehika Paspunuri9092";
char[] c1= name.toCharArray();
System.out.println(Arrays.toString(c1));
for(int i=0;i<c1.length;i++)
{
	boolean answer= Character.isDigit(c1[i]);
	if(answer==true)
	{
		countnumeric++;
		
	}
}
System.out.println("Count of numeric->" +countnumeric);
}

	}


