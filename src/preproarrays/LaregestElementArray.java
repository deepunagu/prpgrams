//WAJP to find largest elements in an array

package preproarrays;
public class LaregestElementArray {
	public static void main(String[] args) {
		int a[]= {7,30,21,20,76};
		int largest;
		largest=a[0];
		for (int i=0; i<a.length; i++) {
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("Largest element of ana array is"+largest);
	}

}
