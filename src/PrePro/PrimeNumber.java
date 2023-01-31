//WJP to check the given number is Prime number

package PrePro;
import java.util.Scanner;
 class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				count++;	
		}
		if(count==2)
		{
			System.out.println("it is a Prime number");	
		}
		else
		{
			System.out.println("its not a Prime number");
		}
	}
}
