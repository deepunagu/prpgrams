package PrePro;

import java.util.Scanner;

public class CharacterPostionInSTring {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String : ");
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++) 
		{
			char ch=str.charAt(i);
		}
		
		System.out.println( "character a" +ch);
		

	}

}
