package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;
	
	public KucnaHemija(int sifra, String naziv, String opis, int kolicina, Date rokTrajanja) {
		super(sifra, naziv, opis, kolicina);
		this.rokTrajanja = rokTrajanja;
	}

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	
}
