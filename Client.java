package Pharmacie;

public class Client {
		public String name;
		public float montant;
		public Medicament[] medicaments;
		Client (){
			
		}
		Client (String n, float montant){
			this.name = n;
			this.montant = montant;
			
		}
		Client (Client c){
			this.name = c.name;
			this.montant = c.montant;
		}
		
		public String toString ()
		{
			int n=0;
			String S= this.name+"\n";
			if (this.medicaments !=null)
			n = this.medicaments.length;
			
			if (n !=0)
			{
				for (int i =0;i<n;++i)
				{
					S+= this.medicaments[i].name +"	"+this.medicaments[i].quantite +"\n";   
				}
			}
			
			return S + "Total " + montant ;
		}
		public void acheter (Medicament [] ordonnance,Medicament [] stock)
		{
			//verifier si les médicament sont présent dans le stock
			
			for (int i =0;i<ordonnance.length;++i)
			{
				for (int j = 0; j<stock.length;++j)
				{
					if (ordonnance[i].name.equals(stock[j].name))
					{
					ordonnance[i].quantite = Math.min(ordonnance[i].quantite, stock[j].quantite);
					stock[j].quantite -=ordonnance[i].quantite;
					this.montant += stock[j].prix *ordonnance[i].quantite; 
					}
				}
			}
			this.medicaments = ordonnance;
			
		}
		
}
