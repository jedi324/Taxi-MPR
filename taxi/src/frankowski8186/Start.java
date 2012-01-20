package frankowski8186;

import frankowski8186.services.dbm;


public class Start {

	public static void main(String[] args) {

		Miasto Gdansk = new Miasto("Gdansk");
		Gdansk.dodajFirme("Hallo Taxi", "Trakt �w. Wojciecha 29");
		Gdansk.dodajFirme("Super Hallo Taxi", "Biega�skiego 10/28");
		Gdansk.dodajFirme("Auto-Taxi-Nord", "Chwaszczy�ska 28");
		Gdansk.dodajFirme("Comfort Van", "Kr�la Jana Kazimierza 5/23");

		Gdansk.wyswietlListe();

		Gdansk.edytuj("Hallo Taxi", "Hallo");
		Gdansk.wyswietlListe();

		Gdansk.edytuj("Trakt �w. Wojciecha 29", "Kr�la Jana Kazimierza 5/23");
		Gdansk.wyswietlListe();

		Gdansk.usun("Auto-Taxi-Nord");		
		Gdansk.wyswietlListe();

		Gdansk.usunPoz(2);
		Gdansk.wyswietlListe();

		String[] tab = new String[20];
		tab[0]= "Hello";
		tab[1]= "Super Hallo Taxi";
		tab[2]= "Chwaszczy�ska 28";
		Gdansk.szukajKilku(tab);
		
		Firmy g = Gdansk.gettaxi(0);
		dbm db = new dbm();
		db.addFirmy(g);

	}
	

}