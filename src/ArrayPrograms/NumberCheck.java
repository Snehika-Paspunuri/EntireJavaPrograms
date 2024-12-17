package ArrayPrograms;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nos[]=new int[4];
nos[0]=90;
nos[1]=98;
nos[2]=65;
nos[3]=41;
int givenno=41;
for(int i=0;i<nos.length;i++)
{
	if(givenno==nos[i])
		{
		System.out.println("Number is present in given Array at indexposition" +nos[i]);
		}
	else
		{
		System.out.println("Number not present");
		}}
	}

}
