package preproarrays;

public class NonRepeatingArray {

	public static void main(String[] args) {
		int a[]= {12,4,12,40};
		int count=0;
		for (int i=0; i<a.length;i++)
		{
			int n=a[i];
			int count=0;
			for(int j=0; j<a.length;j++)
			{
				if(a[j]==n)
					count++;
			}
		}
		
	}

}
