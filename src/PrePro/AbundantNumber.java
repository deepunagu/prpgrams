//4.//WAJP to check wthether number is abundant number //
package PrePro;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int sum=0;
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum>n)
		{
			System.out.println("The number is abundant number" );
		}
		else
		{
			System.out.println("The number is not  abundant number" );
		}
		
	}

}
