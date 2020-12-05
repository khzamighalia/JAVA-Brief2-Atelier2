package atelier2b2;

public class Secretaire extends Personne {

	private String numeroBureau;
	public static int nbrS=0;

	public Secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance, String numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroBureau = numeroBureau;
		nbrS++;
	}

	public String getNumeroBureau() {
		return numeroBureau;
	}

	public void setNumeroBureau(String numeroBureau) {
		this.numeroBureau = numeroBureau;
	}

	@Override
	public String toString() {
		return super.toString()+" numeroBureau= " + numeroBureau;
	}
	public void ecrirePersonne() {
		System.out.print(" Secretaire : ");
		System.out.println(this.toString());
	}
	
	
	
}
