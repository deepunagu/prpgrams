package preproarrays;

import java.util.Scanner;
public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter sixe of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0; i<n; i++)
		{
			System.out.println("enter the elements");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}