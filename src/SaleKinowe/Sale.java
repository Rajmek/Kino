package SaleKinowe;

public class Sale {
	
	String nazwaSali;
	int numerSali;
	int iloscMiejsc;
	int iloscZajetychMiejsc;
	
	public Sale(String nazwaSali, int numerSali, int iloscMiejsc, int iloscZajetychMiejsc) {
		this.nazwaSali = nazwaSali;
		this.numerSali = numerSali;
		this.iloscMiejsc = iloscMiejsc;
		this.iloscZajetychMiejsc = iloscZajetychMiejsc;
	}
	

	String sprawdzCzyWolneMiejsca() {
		if(iloscZajetychMiejsc == iloscMiejsc)
			return "brak miejsc";
		else if(iloscZajetychMiejsc < iloscMiejsc)
			return "W sali sa wolne miejsca";
		else
			return "blad";

	}
	
	void wyswietl() {
		System.out.println("Nazwa sali: " + nazwaSali + " Ilosc miejsc w sali: " + iloscMiejsc + " Ilosc zajetych miejsc: " + iloscZajetychMiejsc);
	}
}
