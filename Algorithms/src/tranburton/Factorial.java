package tranburton;
/** Factorial programs
 * April 3rd
 * @author Alina Tran-Burton
 */
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print ("Please enter a positive integer.");
		int x = scan.nextInt();
		System.out.print (factorial(x));
	}
	public static int factorial (int x)
	{
		for (int y = x-1; y > 0; y--)
		{
			x=y*x;
		}
		return x;
	}

}
