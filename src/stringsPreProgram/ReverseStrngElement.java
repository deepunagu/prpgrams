//WAJP to find Reverse element in String
package stringsPreProgram;

import java.util.Scanner;

public class ReverseStrngElement {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		String rev=" ";
		//int length=s.length();
		//for(int i=length-1; i>=0; i--)
			/*for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}*/
			
		//using Character array	
			char a[]=s.toCharArray();
			int length=a.length;
			for(int i=length-1; i>=0; i--)
			{
				rev=rev+a[i];
			}
			
			
		System.out.println("Reverse string is " + rev);
	}

}
