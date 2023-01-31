//WAJP TO PRINT FIZZ FOR EVEN NUMBER BUZZ FOR ODD NUMBERS?

package PrePro;

import java.util.Scanner;

public class FizEvenBuzOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");	
	int n=s.nextInt();
	if(n%2==0)
	{
		System.out.println("Fizz");
	}
	else
	{
		System.out.println("buzz");
	}	

	}

}
