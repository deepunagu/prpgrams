//.Read two integers from the user, display a menu where the user will have the following option
//1. addition
//2. subtraction
//3. multiplication
//4. Division
//Users can select any one of the following tasks that task has to be done and 
//the result must be displayed, if the user selects an invalid option display please enter valid input.

package PrePro;

import java.util.Scanner;

public class SwitchAddSubMultiDivision {

	public static void main(String[] args) {
		boolean anythingGiveVariabName=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		while(!anythingGiveVariabName)
		{
		System.out.println("enter your choices");
		System.out.println("1.Addition");
		System.out.println("2.Sub");
		System.out.println("3.multi");
		System.out.println("4.Division");
		System.out.println("5.exit");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sum=num1+num2;
			System.out.println(" addition " + sum);
			break;
		case 2:
			sum=num1-num2;
			System.out.println(" substract " + sum);
			break;
		case 3:
			sum=num1*num2;
			System.out.println(" multification" + sum);
			break;
		case 4:
			sum=num1/num2;
			System.out.println(" division " + sum);
			break;
		case 5:
			anythingGiveVariabName=true;
			System.out.println(" exit " );

			default:
				System.out.println("thank you");
				break;
		}
		}	
	}
}
