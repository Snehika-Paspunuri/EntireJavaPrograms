package ArrayPrograms;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String input1="bread";
			String input2="beard";
			if(input1.length()!=input2.length())
			{
				System.out.println("They are not anagram");
			}
			else
			{
				System.out.println("They are Anagram");
			}
			char[] c1=  input1.toCharArray();
			char[] c2=  input2.toCharArray();
			System.out.println("Before sorting->");
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After Sorting->");
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("They are Anagram");
			}
			else
			{
				System.out.println("They are not Anagram");
			}
		}
	}

}
