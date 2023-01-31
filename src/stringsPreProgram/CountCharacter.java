//WAJP to count the Character

package stringsPreProgram;
public class CountCharacter {
	public static void main(String[] args) {
		String s=" Hellow  hi deepika";
		int count=0;
		System.out.println("length of a string" +s.length());
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
     System.out.println("total count as string is" + count);
	}
}
