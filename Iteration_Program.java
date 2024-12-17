package CollectionPrograms;
import java.util.ArrayList;
import java.util.Iterator;
public class Iteration_Program {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add("Sita");
		a1.add("umesh");
		a1.add(78);
		a1.add("67");
		a1.add(true);
		a1.add(97);
		System.out.println(a1.size());
		System.out.println(a1.contains("Sita"));
		System.out.println(a1);
		
		Iterator i1= a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
				
	}

}
