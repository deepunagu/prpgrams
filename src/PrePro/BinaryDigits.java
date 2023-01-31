// to check or count how many  binary digits present in given number

package PrePro;

import java.util.Scanner;

public class BinaryDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number:" );
		int n=sc.nextInt();
		int count=0;
		while (n>0) {
			int rem=n%10;
			if(rem==0 || rem==1)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count );
	}

}
