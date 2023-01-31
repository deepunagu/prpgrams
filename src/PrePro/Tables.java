// to creat a table 

package PrePro;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a number ");
		int n=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println( n + "  * " + i + " = " +(n*i));
		}		
	}
}
