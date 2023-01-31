//WAJP to convert Decimal to Binary

package preproarrays;

import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal");
		int n=sc.nextInt();
		String bin=" ";
		while(n>0)
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}	
      System.out.println(bin);
	}
}
