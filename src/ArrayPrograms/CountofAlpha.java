package ArrayPrograms;

import java.util.Arrays;

public class CountofAlpha {
static int countofalpha=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Snehika Paspunuri";
char[] c1=name.toCharArray();
System.out.println(Arrays.toString(c1));
for(int i=0; i<c1.length;i++)
{
boolean answer= Character.isAlphabetic(c1[i]);
//System.out.println(answer);
if(answer==true)
{
	countofalpha++;
	}
}
 System.out.println("The total count of alphabets "+ countofalpha);


	}
}
