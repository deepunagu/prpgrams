//WAJP to print a Zero or NonZero  Number

package PrePro;
import java.util.Scanner;
public class ZeroNonZeroNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if (num==0)
		{
			System.out.println("Number is Zero Number");
		}
		else 
		{
			System.out.println("Number is Non Zero Number");
		}	
	}
}
