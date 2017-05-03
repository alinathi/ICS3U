package tranburton;
/** Pythagorean Triple
 * April 7th
 * @author Alina Tran-Burton
 */
public class PythagoreanTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		for (int b = 1; a <100; b++){
			int c = (int) (Math.pow(a, 2)+ Math.pow(b, 2));
			if (perfectSquare(c) == true ){
				System.out.print(a + "" + b + "" + (int) Math.sqrt(c));
			}
			if ( b == 100){
				b = 1;
				a++;
			}
			// new method
		}
	}
	public static boolean perfectSquare(int a) {
		int x = (int) Math.sqrt(a);
		double check = Math.pow(x,  2);
		if (a == check) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
