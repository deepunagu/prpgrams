 //Write a program to check the given number is Strong number or not

package preproarrays;

import java.util.Scanner;
public class BinaryDecimalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number");
		int dec=0,r, i=1;
		int binary=sc.nextInt();
		while(binary!=0)
		{
			r=binary%10;
			dec=dec+r*i;
			i=i*2;
			binary=binary/10;
		}
		System.out.println(dec);
	}
}
