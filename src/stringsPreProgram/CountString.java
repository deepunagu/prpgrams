//WAJP HOW TO COUNT THE WORDS PRESENT IN A STRING

package stringsPreProgram;
import java.util.Scanner;
public class CountString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=1;
		for(int i=0; i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!= ' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
