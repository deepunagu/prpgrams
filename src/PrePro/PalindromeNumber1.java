//WAJP to print a Palindrome Number
package PrePro;
import java.util.Scanner;
public class PalindromeNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter a number");
		int n=sc.nextInt();
		int temp=n, rev=0;
		while(n>0)
		{
			 rev=n%10;
			System.out.print(rev);
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println(" Not a Palindrome Number");
		}
	}

}
