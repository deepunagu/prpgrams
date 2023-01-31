//WAJP to read numbers(m and n) from the user, and count numbers present
//between them (excluding m and n).

package PrePro;
import java.util.Scanner;

public class CountNumBtw_MandN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number for M and N");
int m=sc.nextInt();
int n=sc.nextInt();
int count=0;
for(int i=++m; i<n; i++)
{
	count++;
}
System.out.println(count);
	}

}
