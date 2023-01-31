package PrePro;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=2; i<=n; i=i+2)
		{
			sum=sum+i; //sum+=i;
		}
		System.out.println("sum of even numbers are ="+ sum);
	}

}
