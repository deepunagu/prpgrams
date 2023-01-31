//WAJP to Find Polindrome in String

package stringsPreProgram;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {		
System.out.println("Enter thr string");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(); 
String original_str=s;
String rev="";
int length=s.length();
for(int i=length-1; i>=0; i--)
{
	rev=rev+s.charAt(i);	
}
if(original_str.equals(rev))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
	}
}
