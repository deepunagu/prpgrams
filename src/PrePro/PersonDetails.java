//WAJP TO READ THE PERSON NAME,AGE,MOBILE NUMBER AND CITY NAME?

package PrePro;

import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person name");
		String name=sc.next();
		System.out.println("Enter person age");
		int age=sc.nextInt();
		System.out.println("Enter person contactnumber");
		long mobileNo=sc.nextLong();
		System.out.println("Enter person city");
		String city=sc.next();
		System.out.println(" Name " + name);
		System.out.println(" Age " + age);
		System.out.println(" ContactNumber " + mobileNo);
		System.out.println(" City " + city);	

	}

}
