//WAJP to finf smallest elements in an array using Scanner
package preproarrays;
import java.util.Scanner;

public class SmalElemArrayScanner {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in)	;
	System.out.println("Enter the size of array");
int size=sc.nextInt();
int a[]=new int[size];
for (int i=0; i<size;i++)
{
	a[i]=sc.nextInt();
}
int small;
small=a[0];
for(int i=0; i<a.length; i++)
{
	if(a[i]<small)
	{
		small=a[i];
	}
}
System.out.println("smllest number in array " + small);	
	} 
}
