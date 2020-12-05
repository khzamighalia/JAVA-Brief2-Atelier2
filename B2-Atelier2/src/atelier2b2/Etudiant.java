package atelier2b2;

public class Etudiant extends Personne {

	private String diplome;
	public static int nbrEt=0;
	
	public Etudiant(String nom, String prenom, String adresse, String ville, int dateNaissance, String diplome) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.diplome = diplome;
		nbrEt++;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	@Override
	public String toString() {
		return super.toString()+" diplome= " + diplome;
	}
	
	public void ecrirePersonne() {
		System.out.print(" Etudiant  : ");
		System.out.println(this.toString());
	}
	
	
	
}
