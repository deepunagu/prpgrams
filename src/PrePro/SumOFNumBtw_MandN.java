// WJAPto read numbers(m and n) from the user, and obtain the sum of all the
//values.

package PrePro;
import java.util.Scanner;
public class SumOFNumBtw_MandN {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number for M and N");
	int m=sc.nextInt();
	int n=sc.nextInt();
	int sum=0;
	for(int i=m; i<=n; i++)
	{
		sum+=i;
	}
	System.out.println(sum);
	}
}
