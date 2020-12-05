package atelier2b2;

public class Employe {
	private String nom;
	private String prenom;
	private String adress;
	private int anneeNaissance;
	private int anneeEncours;
	
	public Employe(String nom, String prenom, String adress, int anneeNaissance, int anneeEncours) {
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.anneeNaissance = anneeNaissance;
		this.anneeEncours = anneeEncours;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	public int getAnneeEncours() {
		return anneeEncours;
	}
	public void setAnneeEncours(int anneeEncours) {
		this.anneeEncours = anneeEncours;
	}
	
	public int calculerAge() {
		return anneeEncours-anneeNaissance;
	}
	public void afficherInfosClient() {
		System.out.println(nom+" "+prenom+" né le "+anneeNaissance+" habitant à "+adress);
		
	}

}
