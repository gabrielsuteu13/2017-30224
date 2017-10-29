
public class Main {

	public static void main(String[] args) {

		Instrument[] band1Instruments = { Instrument.GUITAR, Instrument.BASS, Instrument.DRUMS, Instrument.VOICE };
		Band band1 = new Band(band1Instruments, "Xtreme");

		Instrument musician1Instrument = Instrument.DRUMS;
		Musician musician1 = new Musician("Marin", musician1Instrument);

		band1.addMusician(musician1);

		Instrument[] band2Instruments = { Instrument.VOICE, Instrument.BASS };
		Band band2 = new Band(band2Instruments, "Hip-Hop Band");

		Instrument musician2Instrument = Instrument.BASS;
		Musician musician2 = new Musician("Alex", musician2Instrument);
		band2.addMusician(musician2);
		

	}

}
