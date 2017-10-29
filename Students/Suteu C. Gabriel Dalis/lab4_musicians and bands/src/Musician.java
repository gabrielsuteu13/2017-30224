
public class Musician {
	private Instrument instrument;

	private String username;

	public Musician(String username, Instrument instrument) {
		this.username = username;
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return this.instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getUserName() {
		return this.username;
	}

	public void setUserName(String username) {
		this.username = username;
	}
}
