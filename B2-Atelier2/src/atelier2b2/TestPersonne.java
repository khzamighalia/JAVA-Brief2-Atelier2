package atelier2b2;

/*import static atelier2b2.Secretaire.nbrS;
import static atelier2b2.Enseignant.nbrE;
import static atelier2b2.Etudiant.nbrEt;
*/

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Secretaire s=new Secretaire("El alami","Mohammad"," N8 RUE HSJSJJS","Safi",1988,"82929");
		Secretaire s2=new Secretaire("ghalia","khzami"," N8 RUE kkkkk","Safi",1997,"8292999");
		Enseignant e=new Enseignant("El wahabi","Khalid"," N20 RUE PPPPP","Casablanca",1978,"Mathématiques ");
		Etudiant et=new Etudiant("Sbai","Fouad"," N20 RUE NNNNN","Meknes",1998,"DUT");
		
		s.ecrirePersonne();
		s2.ecrirePersonne();
		e.ecrirePersonne();
		et.ecrirePersonne();
		
		et.modifiePersonne(" RUE SKSKS"," RABAT");
		et.ecrirePersonne();
		System.out.println(" Nombre de secrétaires crées :"+Secretaire.nbrS);
		System.out.println(" Nombre de enseignants crées :"+Enseignant.nbrE);
		System.out.println(" Nombre de enseignants crées :"+Enseignant.nbrE);
		System.out.println(" Nombre de étudiants crées :"+Etudiant.nbrEt);

	}

}
