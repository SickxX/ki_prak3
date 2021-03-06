package ki_Prak3;

import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class Move {
	
	
	 Wheel wheel1 = WheeledChassis.modelWheel(Motor.A, 56).offset(-50);
	 Wheel wheel2 = WheeledChassis.modelWheel(Motor.D, 56).offset(50);
	 Chassis chassis = new WheeledChassis(new Wheel[]{wheel1, wheel2}, WheeledChassis.TYPE_DIFFERENTIAL); 
	 MovePilot pilot = new MovePilot(chassis);
	

	public void forward(int n) {
		pilot.travel(-n);
	}
	
	public void rotate(int n) {
		
		pilot.setAngularSpeed(75);
		pilot.rotate(n);
		

	}
}
