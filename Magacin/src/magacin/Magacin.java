package magacin;

import java.util.LinkedList;

import interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {
	LinkedList<Artikal> artikli = new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		boolean postoji = false;
		for (Artikal a : artikli) {
			if(a.equals(artikal)) {
				postoji = true;
				a.setKolicina(a.getKolicina()+artikal.getKolicina());
			}
		}
		
		if (!postoji)
			artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
