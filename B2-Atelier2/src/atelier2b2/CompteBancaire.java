package atelier2b2;

public class CompteBancaire {

	private int num�ro_compte;
	private Double solde;
	
	
	public CompteBancaire(int num�ro_compte, Double solde) {
		this.num�ro_compte = num�ro_compte;
		this.solde = solde;
	}

	public int getNum�ro_compte() {
		return num�ro_compte;
	}


	public void setNum�ro_compte(int num�ro_compte) {
		this.num�ro_compte = num�ro_compte;
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
		return "Compte Bancaire [num�ro_compte=" + num�ro_compte + ", solde=" + solde + "]";
	}
}
