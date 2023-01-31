package basicsJava;

class BankDetails
{
    private String bankName;
    private int atmNumber;
    public BankDetails(String bankName,int atmNumber)
    {
	 this.bankName=bankName;
	 this.atmNumber=atmNumber;
    }
 
    public String getbankName()
    { 
	System.out.println("BankName="+bankName);
	return bankName;
    }
    public int getatmNumber()
    {
	System.out.println("AtmNumber="+atmNumber);
	return atmNumber;
    }
    public void setbankName(String bankName)
    {
	System.out.println("update the required details");
	this.bankName=bankName;
    }
    public void setatmNumber(int atmNumber)
    {
	System.out.println("update the required details");
	this.atmNumber=atmNumber;
    }
    }
  
public class Program01 
{

	public static void main(String[] args)
    {
		BankDetails b1=new BankDetails("IDBI",8978)	;
		System.out.println(b1.getbankName());
		System.out.println(b1.getatmNumber());
		b1.setbankName("IDBI");
		b1.setatmNumber(0123);
		
		
	}

}
