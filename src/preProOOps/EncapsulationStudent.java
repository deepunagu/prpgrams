//Encapsulation
package preProOOps;
public class EncapsulationStudent {
	private int Id;
	private String Name;
	private String Email;
	private long Phno;
	private	String Gender;
	private double Fees;
	private String Address;
	private float Per;
	private String Dob;
	private String Maritals;
	
	
	public EncapsulationStudent(int id, String name, String email, long phno, String gender, double fees,
			String address, float per, String dob, String maritals) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Phno = phno;
		Gender = gender;
		Fees = fees;
		Address = address;
		Per = per;
		Dob = dob;
		Maritals = maritals;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public double getFees() {
		return Fees;
	}
	public void setFees(double fees) {
		Fees = fees;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public float getPer() {
		return Per;
	}
	public void setPer(float per) {
		Per = per;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getMaritals() {
		return Maritals;
	}
	public void setMaritals(String maritals) {
		Maritals = maritals;
	}
	
	public static void main(String[] args) {
		EncapsulationStudent s1=new EncapsulationStudent(1,"deepu","deepu.sn.nagu@gmail.com",9844259511l,"female",5500.25d,"mandya",77.7f,"25-july-2022","married");
		s1.setId(2);
		s1.setName("vinu");
		s1.setEmail("deepu.sanvidhi@gmail.com");
		s1.setPhno(9743531269l);
		s1.setGender("male");
		s1.setFees(6800.5d);
		s1.setAddress("halagur");
		s1.setPer(78.7f);
		s1.setDob ("02-may-2022");
		s1.setMaritals("married");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getEmail());
		System.out.println(s1.getPhno());
		System.out.println(s1.getGender());
		System.out.println(s1.getFees());
		System.out.println(s1.getAddress());
		System.out.println(s1.getPer());
		System.out.println(s1.getDob());
		System.out.println(s1.getMaritals());				
	}
}
