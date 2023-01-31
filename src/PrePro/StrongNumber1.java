 //Write a program to check the given number is Strong number or not.

package PrePro;
import java.util.Scanner;
public class StrongNumber1 {
	public static void main(String[] args) {
	      //  int num,copy,rem,fact,i,sum=0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a number : ");
		       int n=sc.nextInt();
		     int  copy=n;
		     int sum=0;
		    
		        while (n>0)
		        {
		           int rem=n%10;
		           int fact=1;
		            for(int i=1;i<=rem;i++){
		               fact=fact*i;
		            }
		          
		            sum=sum+fact; // sum+=fact;
		            n=n/10;
		        }
		        if (sum == copy) {
		            System.out.println(copy + " is STRONG NUMBER");
		        } else {
		            System.out.println(copy+ " is not a STRONG NUMBER");
		        }
		    }
		}
	


