package tranburton;
/** Highest Number Program
 * April 3rd
 * @author Alina Tran-Burton
 */
import java.util.Scanner;
public class HighestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Please enter five positive integers.");
		int [] num = new int [5];
		for (int i = 0; i<num.length; i++)
		{
			num [ i] = scan.nextInt();
		}
		System.out.print ("The largest number is " +highest(num));
	}
	public static int highest (int [] num)
	{
		int x = num [0];
		for (int i = 1; i < num.length; i++)
		{
			x=Math.max(x, num[0]);
		}
		return x;
	}
	
}