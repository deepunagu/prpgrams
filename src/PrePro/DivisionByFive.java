//WAJP to read a number from the user,if the number is divisible by 5 print lucky else do nothing

package PrePro;

import java.util.Scanner;

public class DivisionByFive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		if(num%5==0)
		{
			System.out.println("lucky number");
		}
		
		else
		{
			System.out.println("nothing");
		}
	}

}
