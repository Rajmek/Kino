package SaleKinowe;


public class Rezerwacja  {
	public static void main(String[] args) {
	
	RezerwacjaSal nowaRezerwacja = new RezerwacjaSal();
	
	

	SalaNr1 salaNr1 = new SalaNr1(50, 15);
	
	nowaRezerwacja.sprawdzSale();
	
	System.out.println("Rozmiar sali: " + salaNr1.getSize() + " Wolne miejsca na sali " + salaNr1.wolneMiejsca);
	
	
	
	
}
}
