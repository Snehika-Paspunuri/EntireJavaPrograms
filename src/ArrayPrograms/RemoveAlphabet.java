package ArrayPrograms;

public class RemoveAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="Snehika9092";
String output=    input.replaceAll("[a-z]", " ");
System.out.println(output);
String input1="School123";
String output2=input1.replaceAll("[A-Z]", " ");
System.out.println(output2);
	}

}
