package preProOOps;

public class Sim {
	long num;
	String type;
	String service_provider;
	int price;
	String code;
	String colur;
	
	public Sim(long num, String type, String service_provider, int price, String code, String colur) {
		
		this.num = num;
		this.type = type;
		this.service_provider = service_provider;
		this.price = price;
		this.code = code;
		this.colur = colur;	
	}
	
public void displaySimDetails()
{
	System.out.println(num);
	System.out.println(type);
	System.out.println(service_provider);
	System.out.println(price);
	System.out.println(code);
	System.out.println(colur);
	
}
	
}
