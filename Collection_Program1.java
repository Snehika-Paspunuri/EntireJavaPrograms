package CollectionPrograms;
import java.util.ArrayList;
public class Collection_Program1 {

	public static void main(String[] args) {
ArrayList a1=new ArrayList();
a1.add("Ram");
a1.add("Umesh");
a1.add(12);
a1.add("67");
a1.add(true);
a1.add(98);
System.out.println(a1);
a1.remove(0);
System.out.println(a1);
a1.remove("67");
System.out.println(a1);

//a1.clear();
//System.out.println("A1 after clearing:");
boolean answer1=   a1.isEmpty();
System.out.println(answer1);

ArrayList a2=new ArrayList();
a2.addAll(a1);
System.out.println(a2);
a2.add("SNEHIKA");
a2.addAll(0,a1);
System.out.println(a2);
System.out.println("Brfore removing:" +a2);
//a2.removeAll(a1);
//System.out.println("After removing:" +a2); 

ArrayList a3=new ArrayList();
a3=(ArrayList) a2.clone();
System.out.println("a3 is made just replica of a2" +a3);
	}

}
