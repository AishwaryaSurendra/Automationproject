package simple;

public class lamp {
	
	boolean ison,isoff;

	void turnon()
	{
		ison=true;
		System.out.println("Light on? " + ison);
	}
void turnoff() {
	isoff=false;
	System.out.println("Light on? " + isoff);
}
public static void main(String[] args) {
 
	lamp led=new lamp();
	led.turnon();

lamp hallogen=new lamp();
hallogen.turnoff();
}
}