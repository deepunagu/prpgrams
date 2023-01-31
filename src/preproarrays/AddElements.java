package preproarrays;

import java.util.Scanner;
public class AddElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("enter the elements");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}	
	}
}
