package basicsJava;
class SslcHolder
{
	void stateSyllabus()
	{
		System.out.println("completed SsLc and get markscard");
	}
}
class TwelthStd extends SslcHolder
{
	void boardsyllabus()
	{
		System.out.println("got good percentage on 12th standard");
	}
}
class BaDegree extends TwelthStd
{
	void university()
	{
		System.out.println("no backlogs in degree");
	}
}
class Govtwork
{
	void clerk(SslcHolder s1)
	{
		s1.stateSyllabus();
	}
}

public class Upcasting03 
{

	public static void main(String[] args) 
	{
		Govtwork j1=new Govtwork();
		j1.clerk( new SslcHolder());
		j1.clerk( new TwelthStd());
		j1.clerk( new BaDegree());//upcasting	
	}
}
