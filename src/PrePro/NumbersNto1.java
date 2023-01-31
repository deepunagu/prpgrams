//WAJP to print a Numbers from n to 1?
package PrePro;

import java.util.Scanner;

public class NumbersNto1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number");
		int n=sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			System.out.print(" " + i );
		}

	}

}
