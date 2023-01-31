//WAJP to read character from the user, check whether the character is an Alphabet, or a number,or a special character

package PrePro;

import java.util.Scanner;

public class Character {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		
		char ch=sc.next().charAt(0);
		if (ch>='A'&& ch<='Z')
			System.out.println(ch + " capital letter ");
		
		 else if (ch>='a'&& ch<='z')
			System.out.println(ch + " small letter ");
		
		 else if (ch>='0'&& ch<='9')
			System.out.println(ch + " its digits ");
		
		 else 
				System.out.println(" its special letter ");
			
	}

}
