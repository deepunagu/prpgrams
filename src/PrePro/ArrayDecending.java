//WAJP to decending the number using array
package PrePro;
import java.util.Arrays;
public class ArrayDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,3,45,11,56};
		Arrays.sort(a);
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
