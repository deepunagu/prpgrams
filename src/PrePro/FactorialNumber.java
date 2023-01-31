//WAJP to print a Factorial Number
//ex 5!=5*4*3*2*1=120
package PrePro;
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number want upto Factorial");
        int n=sc.nextInt();
		long factorial=1;
        for(int i=1; i<=n; i++)
        {
	   factorial=factorial*i;
       }
System.out.println("factorial of given  number " + factorial);
	}
}
