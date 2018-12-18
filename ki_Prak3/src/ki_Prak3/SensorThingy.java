package ki_Prak3;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.remote.ev3.RMISampleProvider;
import lejos.remote.ev3.RemoteEV3;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class SensorThingy {

	EV3ColorSensor colorSensor;
	SampleProvider colorProvider;
	RMISampleProvider penis = null;
	float[] colorSample;
	RemoteEV3 eve3 = null;
	
	public void getColorSensor() {


		colorSensor = new EV3ColorSensor(SensorPort.S1);
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
