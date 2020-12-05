package atelier2b2;

public class CompteBancaire {

	private int numéro_compte;
	private Double solde;
	
	
	public CompteBancaire(int numéro_compte, Double solde) {
		this.numéro_compte = numéro_compte;
		this.solde = solde;
	}

	public int getNuméro_compte() {
		return numéro_compte;
	}


	public void setNuméro_compte(int numéro_compte) {
		this.numéro_compte = numéro_compte;
	}


	public Double getSolde() {
		return solde;
	}


	public void setSolde(Double solde) {
		this.solde = solde;
	}
 
	public void Ajouter(Double somme) {
		if(somme>0) 
	     this.solde+=somme;
	}
	
	public void Retirer(Double somme) {
		if(somme>0 && this.solde>=somme) 
		this.solde-=somme;
	}


	public String toString() {
		return "Compte Bancaire [numéro_compte=" + numéro_compte + ", solde=" + solde + "]";
	}
}
