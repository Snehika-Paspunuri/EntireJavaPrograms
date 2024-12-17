package CollectionPrograms;
import java.util.ArrayList;
public class Collection_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1= new ArrayList();
a1.add("Ram");
a1.add("Eshaan");
a1.add(10);
a1.add(23);
a1.add(true);
a1.add(98);
System.out.println(a1);
ArrayList a2=new ArrayList();
a2.addAll(a1);
a2.add("Snehika");
a2.addAll(0, a1);
System.out.println(a2);
	}

}
