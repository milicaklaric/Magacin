package magacin;

import java.util.LinkedList;

import interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {
	LinkedList<Artikal> artikli = new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		if (artikli.contains(artikal)) {
			for (Artikal a : artikli) {
				if(a.equals(artikal)) {
					a.setKolicina(a.getKolicina()+artikal.getKolicina());
				}
			}
		}else {
			artikli.add(artikal);
		}
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		for (Artikal a : artikli) {
			if (a.equals(artikal)) {
				a.setKolicina(a.getKolicina() - artikal.getKolicina());
			}
		}
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		Artikal a = null;
		for (Artikal artikal : artikli) {
			if (artikal.getSifra()==sifra) {
				a = artikal;
			}
		}
		return a;
	}

}
