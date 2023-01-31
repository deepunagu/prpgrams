package basicsJava;

class Landline 
{
	void call()
	{
		System.out.println("calling purpose only");
	}
}
class  Mobile extends Landline 
{
	void videocall()
	{
		System.out.println("we can call videocall using many apps like wtapp ");
	}
	void messaging()
	{
		System.out.println("we can we cam chat with others ");
	}
	void google()
	{
		System.out.println("we can get informatin using browser ");
	}
}
public class DwnCaProgram {

	public static void main(String[] args) {
	
		Landline l1=new Mobile();
		l1.call();	
		Mobile m1=(Mobile)l1;
		m1.call();
		m1.videocall();
		m1.messaging();
		m1.google();		
	}
}
