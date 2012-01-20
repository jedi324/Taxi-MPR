package frankowski8186;

import java.util.ArrayList;
import java.util.List;

public class Miasto {

	private String nazwa;
	private List<Firmy> korporacje = new ArrayList<Firmy>();


	public Miasto(String nazwa){
		this.setNazwa(nazwa);
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void dodajFirme(String nazwaF, String adresF){

		korporacje.add(new Firmy(nazwaF, adresF));
	}	
	public void wyswietlListe(){
		System.out.println("--------------------");
		System.out.println("Miasto: " + nazwa + "\nTaxi:");
		for(Firmy lista : korporacje){
			lista.wyswietlF();			
		}
		System.out.println("--------------------");

	}
	public int szukaj(String tekst){
		int nr=-1;
		for(Firmy lista: korporacje){
			nr++;
			if(lista.getNazwaF().equals(tekst) || lista.getAdresF().equals(tekst)) {
				System.out.println("Pozycja na liscie nr: " + nr);
				System.out.println("Korporacje: " + lista.getNazwaF() + " " + lista.getAdresF() + " znajdujaca sie w: " + getNazwa());
			}			
		}
		return nr;
	}

	public int szukajKilku(String[] tab ){
		int nr=-1;
				for(Firmy lista: korporacje){
			nr++;
			if(lista.getNazwaF().equals(tab[nr]) || lista.getAdresF().equals(tab[nr])) {
				System.out.println("Pozycja na liscie nr: " + nr);
				System.out.println("Korporacje: " + lista.getNazwaF() + " " + lista.getAdresF() + " znajdujaca sie w: " + getNazwa());
			}			
		}
		return nr;
	}

	public void edytuj(String doZmiany, String NowaWartosc){
		for(Firmy lista : korporacje){
			if(lista.getNazwaF().equals(doZmiany)) {
										lista.setNazwaF(NowaWartosc);
										System.out.println("Zmieniono nazwe Firmy");
			}

			if(lista.getAdresF().equals(doZmiany)) {
										lista.setAdresF(NowaWartosc);
										System.out.println("Zmieniono adres Firmy");
			}
		}
	}

	public void usun(String doUsuniencia) {		
		System.out.println(korporacje.remove(szukaj(doUsuniencia)) + " zostala usunienta!");
		}

	public void usunPoz(int pozycja){		
		System.out.println("Firma : " + korporacje.get(pozycja).getNazwaF() + " zostanie usunienta.");
		korporacje.remove(pozycja);

	}
}	