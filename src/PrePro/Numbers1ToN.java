//WAJP to print a Numbers from 1 to n?

package PrePro;
import java.util.Scanner;
public class Numbers1ToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println("the number is = " +i);
		}
	}
}
