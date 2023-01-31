//WAJP TO FIND reverse  ELEMENT IN AN ARRAY?

package preproarrays;
import java.util.Scanner;
public class ReverseArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.println("Enter the array elements"+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("display original elements");
		for (int i=0; i<n; i++)
		{
			
			System.out.println(a[i]);
		}
			System.out.println("reverse an array elements");
			for (int i=n-1; i>=0; i--)
				
			{
				System.out.println(a[i]);
			}
	}
}
