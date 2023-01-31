//WAJP to print a Positive or Negative  Number
//  ...... -5 -4 -3 -2 -1 0 1 2 3 4 5.....
package PrePro;
import java.util.Scanner;
public class PositiveNegNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if (num>0)
		{
			System.out.println("Number is Positive Number");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative Number");
		}
		else 
			System.out.println("Number is Zero ");		
	}
}
