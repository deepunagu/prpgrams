//Write a java program to print the numbers which are multiples of 3 and 5 between m and n?
package PrePro;
import java.util.Scanner;
public class MultiBtw3and5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for M");
		int m=sc.nextInt();
		System.out.println("Enter value for N");
		int n=sc.nextInt();
		for(int i=m; i<=n; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Numbers which are multipes by 3 & 5 are =" + i);
			}
		}
	}
}
