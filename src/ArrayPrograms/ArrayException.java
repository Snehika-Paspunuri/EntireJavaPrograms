package ArrayPrograms;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[3];//if string size is incorrect it throws "ArrayIndexOutOfBoundEception".
		names[0]="Jyothi";
		names[1]="Snehika";
		names[2]="Eshaan";
		names[3]="Eshika";
		for(int i=0;i<4;i++)
		{
			System.out.println(names[i]);
		}
		
		

	}

}
