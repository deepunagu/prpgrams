package overloading;

public class MethodOverLoading {
	public static void sum(int a,int b)
	{
		System.out.println("the sumof two numbers " + (a+b));
	}
		public static void sum(double a,double b, double c)
		{
			System.out.println("the sumof three numbers " + (a+b+c));
			
		}
		public static void sum(float a,float b, float c, float d)
		{
			System.out.println("the sum of four numbers " + (a+b+c+d));	
		} 
		
	public static void main(String[] args) {
		sum(10,20);
		sum(10.0d,20.0d,30.0d);
		sum(10.0f,20.0f,30.0f,40.0f);
	}

}
