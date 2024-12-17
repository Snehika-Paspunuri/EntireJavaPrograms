package ArrayPrograms;

import java.util.Arrays;

public class CopyofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name[]=new String[4];
name[0]="Ram";
name[1]="Sita";
name[2]="Eshika";
name[3]="eshaan";
String namecopy[]=new String[name.length];
for(int i=0;i<name.length; i++)
{
	namecopy[i]    =name[i];
	}
System.out.println(Arrays.toString(name));
System.out.println(Arrays.toString(namecopy));

	}

}
