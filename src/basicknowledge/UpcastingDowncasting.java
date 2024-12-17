package basicknowledge;
class ParentClassone
{
	}
public class UpcastingDowncasting extends ParentClassone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentClassone p1=  new UpcastingDowncasting();
UpcastingDowncasting u1= (UpcastingDowncasting) p1; //downcasting can be done only after doing upcasting.

	}

}
