package magacin;

public class Knjiga extends Artikal {

	public Knjiga(int sifra, String naziv, String opis, int kolicina) {
		super(sifra, naziv, opis, kolicina);
		
	}

	@Override
	public String toString() {
		return "Knjiga [getSifra()=" + getSifra() + ", getNaziv()=" + getNaziv() + ", getOpis()=" + getOpis()
				+ ", getKolicina()=" + getKolicina() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}


}
