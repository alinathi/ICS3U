import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;
public class Program2 {

	public static void main(String[] args) {
		System.out.println("Program 2");
		Button.waitForAnyPress();
		Motor.A.setSpeed(720);
		Motor.B.setSpeed(720);
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(2000);
		System.out.println("Motor A: " + Motor.A.getTachoCount());
		System.out.println("Motor B: " + Motor.B.getTachoCount());
		Motor.A.stop();
		Motor.B.stop();
		System.out.println("Motor A: " + Motor.A.getTachoCount());
		System.out.println("Motor B: " + Motor.B.getTachoCount());
		double counter=Motor.A.getTachoCount();
		while(counter != 0){
			Motor.A.backward();
			Motor.B.backward();
			counter=Motor.A.getTachoCount();
		}
		System.out.println("Motor A:" +Motor.A.getTachoCount());
		System.out.println("Motor B:" +Motor.B.getTachoCount());
		Motor.A.stop();
		Motor.B.stop();
		System.out.println("Motor A:" +Motor.A.getTachoCount());
		System.out.println("Motor B:" +Motor.A.getTachoCount());
		Button.waitForAnyPress();
	}
}
