package preProOOps;

public class Water {
	String Taste;
	String Area;
	String Type;
	String Dencity;
	Fish f=new Fish();
	
	public Water(String taste, String area, String type, String dencity) {
	
	this.Taste = taste;
	this.Area = area;
	this.Type = type;
	this.Dencity = dencity;
	}
	public static void main(String[] args) {
		Water w=new Water("Salty","indian ocean","sea water","800mq" );
		System.out.println(w.Area);
		System.out.println(w.Taste);
		System.out.println(w.Type);
		System.out.println(w.Dencity);
		
		System.out.println(w.f.Colour);
		System.out.println(w.f.Height);
		System.out.println(w.f.Name);
		System.out.println(w.f.Weight);
	}	
}
