//WAJP to print a Palindrome Number

package PrePro;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter a number");
		int n=sc.nextInt();
		int temp=n, rev=0;
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println(" Not a Palindrome Number");
		}
	}
}
