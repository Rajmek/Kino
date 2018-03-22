package SaleKinowe;

public class Sala {

		public int numerSali;
		public int iloscMiejscZajetych;
		public int iloscMiejscWolnych;

		public Sala(int numerSali, int iloscMiejscZajetych, int iloscMiejscWolnych) {
			this.numerSali = numerSali;
			this.iloscMiejscZajetych = iloscMiejscZajetych;
			this.iloscMiejscWolnych = iloscMiejscWolnych;
		}
		
		public void sprawdz() {
			if(iloscMiejscWolnych >= iloscMiejscZajetych)
				return;
		}
		
	

}
