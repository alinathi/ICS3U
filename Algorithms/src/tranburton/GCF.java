package tranburton;
/** Greatest Common Factor Program
 * April 3rd
 * @author Alina Tran-Burton
 */
import java.util.Scanner;
public class GCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the first number (a positive integer).");
		int x = scan.nextInt();
		System.out.println ("Enter the second number (a positive integer).");
		int y = scan.nextInt();
		System.out.println ("The greatest common factor of the two numbers entered is " +gcf(x,y));
	}
	public static int gcf(int x, int y)
	{
		if (x > y)
		{
			for (int i = x; i > 0; i--)
			{
				return i;
			}
		}
		if (y > x)
		{
			for (int i = y; i > 0; i--)
			{
				if(isDivisible(y,i)==true && isDivisible(x,i)==true)
				{
					return i;
				}
			}
		}
		return x;
	}
	public static boolean isDivisible(int x, int y)
	{
		if (x%y == 0)
		{
			return true;
		}
		return false;
	}

}
