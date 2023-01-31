package basicsJava;

class CellPhone
{
	void earphoneMode()
	{
		System.out.println("song playing in earphone");
	}
}
class CellPhone1 extends CellPhone
{
	void normalMode()
	{
		System.out.println("song playing in normal");
	}
}

public class DnProgram {

	public static void main(String[] args)
	{
		CellPhone c1=new CellPhone1();
		c1.earphoneMode();
		CellPhone1 c2=(CellPhone1)c1;
		c2.earphoneMode();
		c2.normalMode();
		
	}

}
