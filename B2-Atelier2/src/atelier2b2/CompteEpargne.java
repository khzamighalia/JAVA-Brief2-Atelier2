package atelier2b2;

public class CompteEpargne extends CompteBancaire {
	
	private Double interet_annuel;

	public CompteEpargne(int numéro_compte, Double solde, Double interet_annuel) {
		super(numéro_compte, solde);
		this.interet_annuel = interet_annuel;
	}

	public Double getInteret_annuel() {
		return interet_annuel;
	}

	public void setInteret_annuel(Double interet_annuel) {
		this.interet_annuel = interet_annuel;
	}
	
	


	@Override
	public void Retirer(Double somme) {
		// TODO Auto-generated method stub
		if(this.getSolde()-somme>=200)
		super.Retirer(somme);
		else System.out.println(" On ne peut pas effectuer cette opération");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void calcul_interet() {
		Double s=this.getSolde();
		Double i=this.getInteret_annuel();
		this.setSolde(s-s*i);
	}
	

}
