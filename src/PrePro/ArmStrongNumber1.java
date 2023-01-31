
//to check wethwe given number is arm strong number or not
package PrePro;
import java.util.Scanner;
public class ArmStrongNumber1 {
	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the  number:" );
			int n=sc.nextInt();
			int copy=n;
			int sum=0;
			while(n>0)
			{
			int rem=n%10;	
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
			if(sum==copy)
			
				System.out.println(copy+"is an ArmStrong number");
			
			else
				System.out.println(copy+"is not an ArmStrong number");
	}

}
