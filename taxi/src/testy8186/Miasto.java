package testy8186;

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

	public List<Firmy> gettaxi() {
		return korporacje;
	}

	public void dodajFirme(String nazwaF, String adresF, Typ_Taxi typ){

		korporacje.add(new Firmy(nazwaF, adresF, typ));
	}	
	public void wyswietlListe(){
		System.out.println("--------------------");
		System.out.println("Miasto: " + nazwa + "\nTaxi:");
		for(Firmy lista : korporacje){
			lista.wyswietlF();			
		}
		System.out.println("--------------------");

	}
	public Firmy szukaj(String tekst){
		for(Firmy lok: korporacje){

			if(lok.getNazwaF().equals(tekst) || lok.getAdresF().equals(tekst)) {
					return lok;
			}		
		}
		return null;

	}


	public void edytuj(String doZmiany, String NowaWartosc){
		for(Firmy lok : korporacje){
			if(lok.getNazwaF().equals(doZmiany)) {
										lok.setNazwaF(NowaWartosc);
										System.out.println("Zmieniono nazwe Firmy");
			}

			if(lok.getAdresF().equals(doZmiany)) {
										lok.setAdresF(NowaWartosc);
										System.out.println("Zmieniono adres Firmy");
			}
		}
	}
	public void edytujObjekt(String doZmiany, String NowaWartosc){
		Firmy a;
		a = szukaj(doZmiany);
		a.setNazwaF(NowaWartosc);
	}

	public void usun(String doUsuniencia) {		
		korporacje.remove(szukaj(doUsuniencia));
	}
	public void zmienTyp(String nazwa, Typ_Taxi typ){
	szukaj(nazwa).setTyp(typ);
	}
	public void usunPoz(int pozycja){		
		korporacje.remove(pozycja);		
	}
	public Firmy pobFirme(int k){
		return korporacje.get(k);
	}


}