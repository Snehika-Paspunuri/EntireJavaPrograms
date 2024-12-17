package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of first Array:->");
		Scanner s1=new Scanner(System.in);
		String names[]=new String[3];
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter the Array:->"+i);
			names[i]=   s1.next();
			}
		System.out.println("Starting of second Array:->");
		String names1[]=new String[3] ;
		for(int i=0;i<names1.length;i++)
		{
			System.out.println("Enter the Array 2:->"+i);
			names1[i]=   s1.next();
			}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(names1));
		if(Arrays.equals(names, names1))
		{
			System.out.println("Hey 2 arrays are same");}
		else
		{
			System.out.println("Sorry not equal");}

			}

	}

