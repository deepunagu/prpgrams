//WAJP to finf largest and smallest elements i an array

package preproarrays;

public class SmallestElementArray {
	public static void main(String[] args) {
		int a[]= {7,30,21,20,76};
		int largest,smallest;
		largest=a[0];
		smallest=a[0];
		for (int i=0; i<a.length; i++) {
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("Largest element of ana array is"+largest);
		System.out.println("Smallest element of ana array is"+smallest);

	}

}
