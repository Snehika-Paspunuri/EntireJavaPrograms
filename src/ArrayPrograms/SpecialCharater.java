package ArrayPrograms;

import java.util.Arrays;

public class SpecialCharater {
static int CountofSpace=0;
static int CountofSpecialchar=0;
static int CountofAlpha=0;
static int CountofNumeric=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=" Snehika Tumma 909$@# ";
char[] c1=name.toCharArray();
System.out.println(Arrays.toString(c1));
int LengthofString=name.length();
System.out.println("Total no of String:" +LengthofString);
System.out.println("===============");
for(int i=0;i<c1.length;i++)
{
	boolean answer= Character.isAlphabetic(c1[i]);
	if(answer==true)
		{
		CountofAlpha++;
		}
	boolean answer1=Character.isDigit(c1[i]);
	if(answer1==true)
	{
		CountofNumeric++;
		
	}
	boolean answer2=Character.isSpaceChar(c1[i]);
    if(answer2==true)
    {
    	CountofSpace++;
    	
    }
    
	}
System.out.println("Total no.of Alphabets:"+  CountofAlpha);
System.out.println("Total no. of Numeric:" + CountofNumeric);
System.out.println("Total no. of Space:" +CountofSpace);

int TotalCount= CountofAlpha + CountofNumeric+ CountofSpace;
System.out.println("The total is: " +TotalCount);
CountofSpecialchar= name.length()-TotalCount;
System.out.println("Total Special Char: "+CountofSpecialchar);

}

}
