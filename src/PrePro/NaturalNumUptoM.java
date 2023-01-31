// WAJP to read a number(m) from the user, and print the natural numbers upto m

package PrePro;
import java.util.Scanner;
public class NaturalNumUptoM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of M");
		int m=sc.nextInt();
		for (int i=1; i<=m; i++)
		{
			System.out.print( i +" " );
		}
	}
}