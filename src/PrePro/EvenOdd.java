//WAJP to read check if number is odd or even number

package PrePro;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	      System.out.println("enter the to check even or odd number=");
	      int a=sc.nextInt();
	      
	      if (a%2==0)
	      {
	    	  System.out.println("the "+ a +"number is even");
	    	  
	      }
	      else
	      {
	    	  System.out.println("the "+ a +"number is odd");
	    	  
	      }
	      
		}

	}
		
	


