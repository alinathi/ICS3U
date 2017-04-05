package tranburton;
/** Prime Number Program
 * April 3rd
 * @author Alina Tran-Burton
 */
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter a positive integer.");
		int prime = scan.nextInt();
		if (primeNum(prime)==true)
		{
			System.out.print ("This is a prime number.");
		}
		else
		{
			System.out.print("This is not a prime number.");
		}
	}
	public static boolean isDivisible (int a, int b)
	{
		if (a% b == 0){
			return true;
		}
		return false;
	}
	public static boolean primeNum (int prime)
	{
		for (int i = 2; i < prime; i ++) {
			if (isDivisible(prime, i)==true) {
				return false;
			}
		}
		return true;
	}

}
