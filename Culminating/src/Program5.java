import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;
public class Program5 {

	public static void main(String[] args) {
		System.out.println("Program 5");
	    Button.waitForAnyPress();
	    Motor.A.setSpeed(720);
		Motor.B.setSpeed(720);
		Motor.C.setSpeed(720);
		Motor.A.rotate(720);
		Motor.B.rotate(720);
		Motor.C.rotate(720);
		for(int i=0; i<=720;i++){
			Delay.msDelay(200);
			System.out.println("Motor A: " + Motor.A.getTachoCount() + "Motor B: " + Motor.B.getTachoCount()+ "Motor C: "+ Motor.C.getTachoCount());
		}
		for(int i=0; i<=7; i++){
			Motor.A.rotate(720);
			Motor.B.rotate(720);
			Motor.C.rotate(720);
			for(int j=0; j<=720;j++){
				Delay.msDelay(200);
				System.out.println("Motor A: " + Motor.A.getTachoCount() + "Motor B: " + Motor.B.getTachoCount()+ "Motor C: "+ Motor.C.getTachoCount());
			}
		}
		Button.waitForAnyPress();
	}
}
