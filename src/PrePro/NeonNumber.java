//*WAJP to print a NeonNumber

package PrePro;
import java.util.Scanner;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		while (sq>0)
		{
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		if(sum==n)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println(" not neon number");
		}
	}
}
