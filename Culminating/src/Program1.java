import lejos.nxt.Button;
import lejos.nxt.Motor;
public class Program1 {

	public static void main(String[] args) {
		System.out.println("Program 1");
		Button.waitForAnyPress();
		System.out.println("FORWARD");
		Motor.A.forward();
		Motor.B.forward();	
		Button.waitForAnyPress();
		System.out.println("BACKWARD");
		Motor.A.backward();
		Motor.B.backward();
		Button.waitForAnyPress();
		System.out.println("END");
	}

}
