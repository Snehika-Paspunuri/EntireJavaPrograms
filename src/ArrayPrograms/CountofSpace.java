package ArrayPrograms;

import java.util.Arrays;

public class CountofSpace {
static int countspace=0;
	public static void main(String[] args) {
		String name="Snehika Tumma 9092";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isSpaceChar(c1[i]);
			if(answer==true)
			{
				countspace++;
				
			}
		}
		
System.out.println("Count of Space->"+countspace);
	}

}
