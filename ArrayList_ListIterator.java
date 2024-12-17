package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Let's understand everything about ListIterator");
List a1=new ArrayList();
//List a2=new ArrayList();
a1.add("Pen");
a1.add("Pencil");
a1.add("Box");
a1.add("bottle");
System.out.println(a1);
ListIterator i2=       a1.listIterator();
while(i2.hasNext())
{
	System.out.println(i2.next());
	}
System.out.println("============");
while(i2.hasPrevious())
{
	System.out.println(i2.previous());}
	}

}
