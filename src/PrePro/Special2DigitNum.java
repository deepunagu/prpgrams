//WAJP to read 1 integer from user & print the number is special 2-digit number(or) not?

package PrePro;

import java.util.Scanner;

public class Special2DigitNum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int d1=n/10;
	int d2=n%10;
	int sum=(d1+d2)+(d1*d2);
	if(sum==n)
	{
		System.out.println("special two digit number");
	}
	else
	{
		System.out.println("not special two digit number");
	}
	}

}
