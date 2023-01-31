//WAJP to print a ReverseNumber

package PrePro;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;			
		}
	}
}
