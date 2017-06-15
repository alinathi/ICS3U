import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class StopWheels implements Behavior{
	private boolean suppressed = false;
	private UltrasonicSensor sonic2 = new UltrasonicSensor(SensorPort.S4);
	public boolean takeControl(){
		sonic2.continuous();
		if(sonic2.getDistance()  <= 10){
			return true;
		}
		return false;
	}
	public void action(){
		suppressed = false;
		//Commands for the robot
		Motor.A.stop();
		Motor.B.stop();
		while(!suppressed){
			Thread.yield();
		}
	}
	public void suppress(){
		suppressed = true;
	}
	}


