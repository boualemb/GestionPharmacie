package Pharmacie;

public class Medicament {
		public String name;
		public float prix;
		public int quantite;
		
		Medicament()
		{
			
		}
		Medicament(String n,float p, int q)
		{
			this.name = n;
			this.prix = p;
			this.quantite = q;
		}
		Medicament(String n, int q)
		{
			this.name = n;
			this.quantite = q;
		}
		Medicament(Medicament m)
		{
			this.name = m.name;
			this.prix = m.prix;
			this.quantite = m.quantite;
		}
		public String toString()
		{
			return name + " | " + (this.prix !=0 ? ( prix + "DA | ") : "")+ this.quantite +" unités";
		}
		public void Approvisionner (int n)
		{
			this.quantite += n;
		}
}
