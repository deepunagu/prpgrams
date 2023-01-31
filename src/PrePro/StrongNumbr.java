//Write a program to check the given number is Strong number or not.
package PrePro;
import java.util.Scanner;
public class StrongNumbr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number:" );
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		while(n>0)	
		{
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;	
			}
			sum+=fact;
		n=n/10;
	    }
		if(copy==sum)
		{
			System.out.println(copy+"is an Strong number");	
		}
		else
		{
			System.out.println(copy+"is not an Strong number");
		}	
    }
	}


