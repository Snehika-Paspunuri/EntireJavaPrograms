package StringProgram;

public class MatchesFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="Snehika";
System.out.println(input.matches("S(.*)"));
System.out.println(input.matches("(.*)a"));
String ip="malik";
System.out.println(ip.matches("....."));
String ip1="nisha";
System.out.println(ip1.matches("(.*a)"));
String a1="school";
int a2=   a1.lastIndexOf('o');
System.out.println(a2);
	}

}
