package basicknowledge;
interface Youtube
{
	void watchlater();
	void play();
	}
interface Gmail
{
	void sendschedule();
	void inbox();
	}
public class MultilevelInterface implements Youtube, Gmail{
public static void main(String args[]) {
	MultilevelInterface m1=new MultilevelInterface();
	m1.watchlater();
	m1.play();
	m1.sendschedule();
	m1.inbox();
	
}

@Override
public void sendschedule() {
	// TODO Auto-generated method stub
	System.out.println("Hi I am sendschedule");
}

@Override
public void inbox() {
	// TODO Auto-generated method stub
	System.out.println("Hi I am inbox");
}

@Override
public void watchlater() {
	// TODO Auto-generated method stub
	System.out.println("Hi I am watchlater");
}

@Override
public void play() {
	// TODO Auto-generated method stub
	System.out.println("I am play");
}
}
