package ki_Prak3;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class SensorThingy {

	EV3ColorSensor colorSensor;
	SampleProvider colorProvider;
	float[] colorSample;
	
	public void getColorSensor() {
		
		Port s3 = LocalEV3.get().getPort("s3");
		colorSensor = new EV3ColorSensor(s3);
		colorProvider = colorSensor.getRGBMode();
		colorSample = new float[colorProvider.sampleSize()];
		
		//solange der ESC Button nicht gepressed ist alter
		while(Button.ESCAPE.isUp()) {
			colorProvider.fetchSample(colorSample, 0);
			System.out.println("R " + colorSample[0]);
			System.out.println("G " + colorSample[1]);
			System.out.println("B " + colorSample[2]);
			Delay.msDelay(300);
		}
		
		colorSensor.close();
	}
	
	public void getAnotherSensor() {
		
	}

}
