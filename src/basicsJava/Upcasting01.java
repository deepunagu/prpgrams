package basicsJava;
class MessagingApp
{
	byte noOfApp=1;
	void sendmsg()
	{
		System.out.println("for one moble one  messges app is der means inbuilt");
		System.out.println("data is not required to send messges");
	}
}

class  WhatsApp extends MessagingApp
{
	
	void chat()
	{
		System.out.println("data is  required to send messges");
	}
	void videocall()
	{
		System.out.println("completly this is online app");
	}
}


public class Upcasting01 {

	public static void main(String[] args) 
	{
		WhatsApp w1=new WhatsApp();
		System.out.println(w1.noOfApp);
		w1.sendmsg();
		w1.chat();
		w1.videocall();
		
		MessagingApp m1=w1;   // upcasting
		System.out.println(m1.noOfApp);
		m1.sendmsg();
		
		

	}

}
