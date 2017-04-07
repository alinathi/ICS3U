package tranburton;
import java.util.Scanner;

/** Backwards Sentence Program
 * April 7th
 * @author Alina Tran-Burton
 */
public class BackwardsSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a sentence");
		String[] sentence = scan.nextLine().split("");
	for (int i=sentence.length-1; i>=0; i--)
	{
		System.out.print(sentence[i]+ "");
	}
	}

}
