package testy8186;

public class Firmy {

	private String nazwaF;
	private String adresF;
	private Typ_Taxi typ;

	public Firmy(String nazwaF, String adresF, Typ_Taxi typ){
		this.nazwaF=nazwaF;
		this.adresF=adresF;
		this.typ=typ;
	}

	public void wyswietlF() {

		System.out.println("Nazwa: " + nazwaF + " Adres: " + adresF + " Typ: " + typ);
	}

	public String getNazwaF() {
		return nazwaF;
	}
	public void setNazwaF(String nazwaF) {
		this.nazwaF = nazwaF;
	}
	public String getAdresF() {
		return adresF;
	}
	public void setAdresF(String adresF) {
		this.adresF = adresF;
	}
	public Typ_Taxi getTyp() {
		return typ;
	}
	public void setTyp(Typ_Taxi typ) {
		this.typ = typ;
	}
}