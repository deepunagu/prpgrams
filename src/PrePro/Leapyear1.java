//WAJP to check wthether the entered year is a leap year//
package PrePro;

import java.util.Scanner;

public class Leapyear1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year to check leap year=");
	int year=s.nextInt();
	
	if (year%4==0)
	{
		if(year%100==0)
		{
			if (year%400==0)
				System.out.println(year +" is a leap year");
			else
				System.out.println(year +" is a not leap year");
		}
	}
	}

}
