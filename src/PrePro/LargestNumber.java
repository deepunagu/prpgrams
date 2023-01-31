//Write a java program to read 3 integers from the user and identify the largest number.

package PrePro;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number of n1");
    int n1=sc.nextInt();
    System.out.println("enter a number of n2");
    int n2=sc.nextInt();
    System.out.println("enter a number of n3");
    int n3=sc.nextInt();
    if(n1>n2 && n1>n3)
    {
    	System.out.println("n1 is largest number");
    }
    else if(n2>n1 && n2>n3)
    {
    	System.out.println("n2 is largest number");
    }
    else
    {
    	System.out.println("n3 is largest number");
    }
	}
}
