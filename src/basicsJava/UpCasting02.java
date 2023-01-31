package basicsJava;
class Sslc
{
	void markscard()
	{
		System.out.println("sslc is basic platform for students");
	}
}
class PUC extends Sslc
{
	void science()
	{
		System.out.println("PCMB is best in science");
	}
}
class Degree extends PUC
{
	void MbBs()
	{
		System.out.println("we need to strugle for five years ");
	}
}
class Job extends  Degree
{
	void Doctor()
	{
		System.out.println(" finally am a doctor");
	}
}
public class UpCasting02 {

	public static void main(String[] args)
{
		Job j1=new Job();
		j1.markscard();
		j1.science();
		j1.MbBs();
		j1.Doctor();
		
		Degree d1=j1;  //upcasting
		d1.markscard();
		d1.science();
		d1.MbBs();
		
		PUC p1=d1;  //upcasting
		p1.markscard();
		p1.science();
		
		Sslc s1=p1;  //upcasting
		s1.markscard();
		

	}

}
