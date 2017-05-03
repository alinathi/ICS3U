package tranburton;
public class PerfectIntegers {
	/** Perfect Integers
	 * April 7th
	 * @author Alina Tran-Burton
	 */
	public static void main(String[] args) {
		
		for (int x = 1; x < 100; x++){
			int sum = 0;
			for (int y = 1; y < x/2; y++){
			}
			if (sum == x)
				System.out.println("This is a perfect square");
		}
		// new method
	}
	public static boolean isDivisible(int a, int b){
		if (a% b == 0){
			return true;
		} 
		return false;
	}
}

