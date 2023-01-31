//WAJPto  calculate the sum of its divisors?

package PrePro;

import java.util.Scanner;

public class SumOfDivisors {

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
		System.out.println("Sum of Divisors is"+ sum );
	}

}
