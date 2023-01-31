//to find sum even number

package PrePro;

import java.util.Scanner;

public class SumOfEvenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter even a number");
		
		int n=sc.nextInt();
		int sum=0;
		for(int i=2; i<=n; i=i+2)
		{
			sum=sum+i; //sum+=i;
		}
		System.out.println("sum of even numbers are ="+ sum);
	}

}
