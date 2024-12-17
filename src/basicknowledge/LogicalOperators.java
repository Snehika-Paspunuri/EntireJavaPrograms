package basicknowledge;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int c=300;
		if(a==b || a<b)
		{
			System.out.println("OR block excecuted");
		}
        if(a>b && c<b)
        {
        	System.out.println("AND operator executed");
        }
        else {
        	System.out.println("You succeded");
        }
        
        if(!(a>=b || c<c))
        {
        	System.out.println("NOT operator excuted");
        }
        else
        {
        	System.out.println("None executed");
        }
	}

}
