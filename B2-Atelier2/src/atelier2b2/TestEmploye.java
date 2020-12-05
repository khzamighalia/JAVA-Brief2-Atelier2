package atelier2b2;

public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee_ac=2020;
		Employe e1= new Employe("El alami","Mohammad","Casablanca",1963,annee_ac);
		Employe e2= new Employe("El wahabi","Khalid","Safi",1990,annee_ac);
		Employe e3= new Employe("Sbai","Fouad","Salé",2006,annee_ac);
		
		e1.afficherInfosClient();
		System.out.println("Il a "+e1.calculerAge()+" ans");
		e2.afficherInfosClient();
		System.out.println("Il a "+e2.calculerAge()+" ans");
		e3.afficherInfosClient();
		System.out.println("Il a "+e3.calculerAge()+" ans");
	}

}
