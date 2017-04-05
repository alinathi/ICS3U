package tranburton;
/** Sum Digits Program
 * April 3rd
 * @author Alina Tran-Burton
 */
import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter a positive integer");
		int num = scan.nextInt();
		System.out.print ("The sum of the digits entered is " + sumDigits(num));
	}
	public static int sumDigits (int num)
	{
		int sum = 0;
		while (num > 0)
		{
			sum = sum + num % 10;
			num = num/10;
		}
		return sum;
	}

}
