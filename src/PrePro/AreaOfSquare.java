//WAJP TO READ SIDE OF A SQUARE BASED ON THAT CALCULATE AND PRINT AREA?

package PrePro;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of side s1");
		int s1=sc.nextInt();
		int area=s1*s1;
		System.out.println("Area of Square is " + area);
		
	}

}
