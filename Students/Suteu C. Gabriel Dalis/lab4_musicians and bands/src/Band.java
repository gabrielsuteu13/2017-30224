
public class Band {
	private String name;

	private Musician[] musicians = new Musician[10];

	private Instrument[] requiredInstrument = new Instrument[10];

	private int indexMusician = -1;

	private int indexRequired = 3;

	public Band(Instrument[] requiredInstrument, String BandName) {
		name = BandName;
		this.requiredInstrument = requiredInstrument;
	}

	public boolean addMusician(Musician musician) {
		boolean required = false;

		int i;

		for (i = 0; i <= indexMusician; i++) {
			if (musician.getInstrument() == requiredInstrument[i])
				required = true;
		}

		for (i = 0; i <= indexRequired; i++)
			if (musician.getInstrument().equals(musicians[i]))
				required = false;

		if (required == true) {
			indexMusician++;
			musicians[indexMusician] = musician;
			return true;
		} else
			return false;
	}

	public Instrument[] getMissingInstrument() {
		int k = 0, i, j;
		boolean required = false;
		Instrument[] MissingInstruments = new Instrument[10];

		for (i = 0; i <= indexRequired; i++) {
			required = false;
			for (j = 0; j <= indexMusician; j++) {
				if (requiredInstrument[i].equals(musicians[j].getInstrument()))
					required = true;
			}
		}
		if (required == false) {
			MissingInstruments[k] = requiredInstrument[i];
			k++;
		}

		return MissingInstruments;
	}
}
