package basicsJava;
class cycle
{
	void travel()
	{
		System.out.println("manually cycling");
	}
}
class Bike extends cycle
{
	void travel()
	{
		System.out.println("petrol or eltric power required");
	}
}
class Car extends Bike
{
	void travel()
	{
		System.out.println("petrol r disel reqiured");
	}
}
class user 
{
	void roaming(cycle c1)
	{
		c1.travel();
	}	
}
public class PolyMorphism {
	public static void main(String[] args) {	
		user u1=new user();
		u1.roaming(new Bike());
		u1.roaming(new Car());		
	}
}
