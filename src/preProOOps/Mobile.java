package preProOOps;

public class Mobile {
	String brand;
	String ram;
	double price;
	int no_of_camera;
	Sim s;
	
	public Mobile(String brand, String ram, double price, int no_of_camera) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.no_of_camera = no_of_camera;
	}
	public void displayMobileDetails()
	{
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(price);
		System.out.println(no_of_camera);
	}
	public void insertSim(Sim s)
	{
		if(this.s==null)
		{
			this.s=s;
			System.out.println("sim is inserted");
		}
	}
	public void removeSim()
	{
		if(s!=null)
		{
			s=null;
			System.out.println("sim is removed");
		}
	}
	public void getSimNumbe()
	{
		if(s!=null)
		{
			System.out.println(s.num);
		}
	}
	public static void main(String[] args) {
	Mobile m=new Mobile("redmi","8gb",18000.0d,1);
	m.displayMobileDetails();
	m.insertSim(new Sim(12345684,"nano","jio",100,"123" ,"gold"));
    m.s.displaySimDetails();
    m.removeSim();
    m.getSimNumbe();
	}
}
