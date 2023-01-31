//WAJP to print a Armstrong Number
package PrePro;
import java.util.Scanner;
public class ArmStrongNimber {
	public static void main(String[] args) {
		int n,sum=0,temp,reminder,digits=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		 n=sc.nextInt();
		 temp=n;
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
		}
		temp=n;
		while(temp!=0)
		{
			reminder=temp%10;
			sum=sum+power(reminder,digits);
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+"is an ArmStrong number");
		else
			System.out.println(n+"is not an ArmStrong number");
	}
	static int power(int n,int r)
	{
		int c,
		p=1;
		for(c=1;c<=r;c++)
			p=p*n;
		return p;
	}

}
