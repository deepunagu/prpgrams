package basicsJava;

interface Home
{
	void stay();
	void safety();
}

class Apartment implements Home
{
	public void stay()
	{
		System.out.println(" there are many flats is der");
	}
	public void safety()
	{
		System.out.println("very secured life");
	}
}
class Palace implements Apartment
{
	public void stay()
	{
		System.out.println(" luxury life");
	}
	public void safety()
	{
		System.out.println("safty provided");
	}
}

class FilmShooting
{
	Home selectplace  
}

 
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
