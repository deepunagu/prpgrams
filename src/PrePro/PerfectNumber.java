//WAJP to read 1 integer from user & print the number is Perfect number(or) not?

package PrePro;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<n; i++)
        {
        	if(n%i==0)
        	{
        		sum+=i; //sum=sum+i
        	}
        }
if(sum==n)
{
	System.out.println("its perfect number");
}
else 
{
	System.out.println("its not aperfect number");
}
	}

}
