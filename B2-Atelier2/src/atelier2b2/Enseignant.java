package atelier2b2;

public class Enseignant extends Personne {

	private String specialite;
	public static int nbrE=0;
	public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance, String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
		nbrE++;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return super.toString()+" specialite= " + specialite + " ";
	}
	
	public void ecrirePersonne() {
		System.out.print(" Enseignant  : ");
		System.out.println(this.toString());
	}
	

	
	

}
