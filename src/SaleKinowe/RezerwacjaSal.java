package SaleKinowe;

import java.util.Scanner;

public class RezerwacjaSal {
	
	
	
	int numerSali;
	int iloscMiejsc;
	int iloscZajetychMiejsc;
	char wynik;

	void sprawdzSale() {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Wprowadz numer sali: ");
		 numerSali = input.nextInt();
		 
		
		System.out.println("(1) Dodaj rezerwacje ");
		System.out.println("(2) Usuñ rezerwacje ");
		System.out.println("(3) Sprawdz ilosc miejsc ");
		System.out.println("(4) wyswietl wolne miejsca ");
	    
		wynik = input.next().charAt(0);
		switch (wynik) {
		case '1':{
			
				System.out.println("Dodano rezerwacje");
			
			
			
			
		
		}
		}
	}
	
	String sprawdzCzyWolneMiejsca() {
		if(iloscZajetychMiejsc == iloscMiejsc)
			return "brak miejsc";
		else if(iloscZajetychMiejsc < iloscMiejsc)
			return "W sali sa wolne miejsca";
		else
			return "blad";
	}
}
