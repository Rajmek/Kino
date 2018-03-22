package SaleKinowe;

import java.util.ArrayList;
import java.util.List;

public class Rezerwacja {

	public static void main(String[] args) {
		
		
		
		
		List<String> listaSal = new ArrayList<String>();
		listaSal.add("SalaNr1");
		listaSal.add("SalaNr2");
		listaSal.add("SalaNr3");	
		
					
		Sala SalaNr1 = new Sala(1, 10, 20);
		Sala SalaNr2 = new Sala(2, 5, 25);
		Sala SalaNr3 = new Sala(3, 20, 10);
		
		
		
		System.out.println("informacje o sali " + SalaNr1 );
		System.out.println(SalaNr2);
		System.out.println(SalaNr3);
		
		SalaNr1.sprawdz();
		
		Kino kino = new Kino(2);
		kino.getNumerSali();
		

		
	}

}
