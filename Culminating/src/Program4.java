import lejos.nxt.Button;
import lejos.nxt.Motor;
public class Program4 {

	public static void main(String[] args) {
		System.out.println("Program 4");
		Button.waitForAnyPress();
	
		/*Motor.C.setSpeed(360);
		Motor.C.backward();
		*/
		for(int i=0; i <= 1440; i++){
			if(Button.waitForAnyPress() != 1){
			}
			Motor.C.rotate(1);
			System.out.println("Motor C: " + Motor.C.getTachoCount());
		}
		Motor.C.stop();
		System.out.println("Motor C: " + Motor.C.getTachoCount());
		Button.waitForAnyPress();
	}

}
