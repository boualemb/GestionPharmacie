package Pharmacie;

public class Pharmacie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c [] = new Client [2];
		
		c[0] = new Client ("Ahmed",0.0f);
		c[1] = new Client ("Samira",0.0f);
		
		afficherClient (c);
		//Definir le Stock de medicaments
		Medicament[] Stock = new Medicament [3];
		Stock[0] = new Medicament ("DOLIPRANE",120,5);
		Stock[1] = new Medicament ("LEVOTHYROX",230,10);
		Stock[2] = new Medicament ("ASPEGIC",90,28);
		//Afficher le Stock
		afficherMedicament(Stock);

		//Definir l'ordonnance de Medicaments de Ahmed 
		Medicament [] ordonanceAhmed = new Medicament [2];
		ordonanceAhmed[0] = new Medicament ("DOLIPRANE",1);
		ordonanceAhmed[1] = new Medicament ("LEVOTHYROX",2);
		//Definir l'ordonnance de Medicaments de Samira
		Medicament [] ordonanceSamira = new Medicament [2];
		ordonanceSamira[0] = new Medicament ("DOLIPRANE",5);
		ordonanceSamira[1] = new Medicament ("ASPEGIC",2);
		
		//Ahmed achete les medicament present dans l'ordonnance.
		//Si le medicament n'existe pas dans le stock ou la quantite est reduite 
		//Il achetera la quantite presente dans le stock 
		c[0].acheter(ordonanceAhmed,Stock);

		//Afficher Ahmed
		System.out.println(c[0]);
		//Afficher ce qui reste dans le stock
		afficherMedicament(Stock);
		//Samira achete les medicament present dans l'ordonnance.
		//Si le medicament n'existe pas dans le stock ou la quantite est reduite 
		//Elle achetera la quantite presente dans le stock 
		c[1].acheter(ordonanceSamira,Stock);
		//Afficher Samira
		System.out.println(c[1]);
		//Afficher ce qui reste dans le stock
		afficherMedicament(Stock);
		//Approvisionner le premier medicament
		Stock[0].Approvisionner(10);

		//Afficher ce qui reste dans le stock apres approvisionement
		afficherMedicament(Stock);
		
	}
	static void afficherClient (Client [] c)
	{
		int n = c.length;
		for (int i = 0;i<n;++i)
		{
			System.out.println(c[i]);
		}
		
	}
	static void afficherMedicament (Medicament [] m)
	{
		int n = m.length;
		for (int i = 0;i<n;++i)
		{
			System.out.println(m[i]);
		}	
	}

}
