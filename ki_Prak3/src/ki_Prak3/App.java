package ki_Prak3;

public class App {

	public static void main(String[] args) {
		
		Move move = new Move();
		SensorThingy sensor = new SensorThingy();
		//AnotherTry
		sensor.getColorSensor();
		move.forward(500);
		move.rotate(900);
		move.rotate(-2700);
		move.forward(500);
		sensor.getColorSensor();
		move.rotate(1800);
		sensor.getColorSensor();
		
		//Scheissladen
		/**
		 
	a. Ausgabe der Rueckgabewerte aller Sensoren auf verbundenem Computer.
	b. 50cm vorwaerts fahren
	c. Sensorwerte
	d. 90Grad Linksdrehung
	e. 270Grad Rechtsdrehung
	f. 50cm vorwaerts fahren
	g. Sensorwerte
	h. 180grad Linksdrehung
	i. Sensorwerte
		
		*/
		
	}

}
