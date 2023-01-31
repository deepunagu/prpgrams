//*WAJP to print a FibboncciSeries

//0 1 1 2 3 5 8 13 21*//*
package PrePro;

import java.util.Scanner;

public class FibboncciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number upto want Fibonci series");
		int n=sc.nextInt(); 
		int num1=0;
		int num2=1;
		for(int i=1; i<=n; i++)
		{
			System.out.print( " " +num1 +" " );
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
