//WAJP to print this program

package PrePro;

public class NestedPattern03 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=5;i++)
		{
			for (int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
