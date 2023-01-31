//*WAJP to print a StrongNumber

package PrePro;

import java.util.Scanner;
public class StrongNumber {
	public static int fact(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0,temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+ " stong number ");
		}
		else
		{
			System.out.println(temp+ "  not stong number ");
		}
	}
}
