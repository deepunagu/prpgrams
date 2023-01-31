package overloading;

public class ConstructorOverloading {
	
	private static final String Java = null;
	int a;
	float b;
	double c;
	String d;
	
	public ConstructorOverloading(int a) {
		this.a = a;
	}

	public ConstructorOverloading(int a, float b) {
		this.a = a;
		this.b = b;
	}

	public ConstructorOverloading(int a, float b, double c) {	
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public ConstructorOverloading(int a, float b, double c, String d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void details()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		ConstructorOverloading c=new ConstructorOverloading(5);
		c.details();
		ConstructorOverloading c1=new ConstructorOverloading(5,60.0f);
		c1.details();
		ConstructorOverloading c2=new ConstructorOverloading(5,60.0f,79.0d);
		c2.details();
		ConstructorOverloading c3=new ConstructorOverloading(5,60.0f,79.0d,"Java");
		c3.details();
		
	}

}
