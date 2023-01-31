//WAJP to find prime elements in array
// 1.3.7,11,13,17,13,23,29,31.......
package preproarrays;

import java.util.Scanner;
public class PrimeNum1to100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			int count=0;
			for (int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==0)
			{
				System.out.println(i);
			}
		}
	}
}
