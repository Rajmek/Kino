package SaleKinowe;

import java.util.ArrayList;
import java.util.List;


public class Kino {
	
	public List<Sala> listaSal;
	

	
	public Kino(List<Sala> listaSal) {
		this.listaSal = new ArrayList<Sala>();
			
		
					
	}
	
	public void dodajSale(Sala sala ) {
		this.listaSal.add(sala);
		}


}

