package PrePro;
public class SumOfElementsArry {
	public static void main(String[] args) {
		int a[]= {5,2,7,9,6};
		int sum=0;
		for (int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i]; //5+2+7+9+6==29
		}
		System.out.println("Sum of array elements:" +sum);
	}
}
