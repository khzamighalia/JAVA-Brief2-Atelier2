package atelier2b2;

public class Article {

	private String nom;
	private Double prix;
	public Article(String nom, Double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	 
	public void afficher() {
		System.out.print(" Artcile : "+getNom()+" Prix avant la réduction: "+getPrix()+" ");
	}
}
