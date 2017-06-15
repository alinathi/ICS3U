import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class Feature implements Behavior{
private boolean suppressed = false;
private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
public boolean takeControl(){
	sonic.continuous();
	if(sonic.getDistance() > 10 ){
		return true;
	}
	return false;
}
public void action(){
	suppressed = false;
	//Commands for the robot
	Button.waitForAnyPress();
	Motor.A.setSpeed(720);
	Motor.B.setSpeed(720);
	Motor.A.forward();
	Motor.B.forward();
	System.out.print("FORWARD");
	while(!suppressed){
		Thread.yield();
	}
}
public void suppress(){
	suppressed = true;
}
}
