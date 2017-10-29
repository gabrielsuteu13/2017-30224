
public enum Instrument {
	GUITAR("electric guitar"), BASS("Marshall"), VOICE("Shakira"), PIANO("The Pianist"), DRUMS("Big Drums");

	private String name;

	private Instrument(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name();
	}

}
