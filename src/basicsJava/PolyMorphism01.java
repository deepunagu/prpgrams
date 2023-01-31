package basicsJava;

class Computer
{
	void msword()
	{
		System.out.println("create resume at home");
	}
	void googleCrome()
	{
		System.out.println("watch online movie");
	}
}
class Desktop extends Computer
{
	void msword()
	{
		System.out.println("we can document at office using desktop");
	}
	void googleCrome()
	{
		System.out.println("desktop is same as computer");
	}
}
class Laptop extends Desktop
{
	void msword()
	{
		System.out.println("same applicatins using  in laptop also");
	}
	void googleCrome()
	{
		System.out.println("easily portable");
	}
}
class Company 
{
	void officework(Computer cp1)
	{
		cp1.msword();
		cp1.googleCrome();
	}	
}
public class PolyMorphism01 {
	public static void main(String[] args) {
		Company c1=new Company() ;
		c1.officework(new Desktop());
		c1.officework(new Laptop());
	}
}
