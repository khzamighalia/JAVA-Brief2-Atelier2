package atelier2b2;

public class TestCompteBancaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompteBancaire cb= new CompteBancaire(56636,1000.00);
		CompteEpargne ce= new CompteEpargne(56636,1000.00,0.02);
		
		System.out.println(cb.toString());
		cb.Ajouter(2000.00);
		System.out.println(cb.toString());
		cb.Retirer(300.00);
		System.out.println(cb.toString());
		System.out.println(ce.toString());
		ce.Ajouter(2000.00);
		System.out.println(ce.toString());
		ce.Retirer(200.00);
		System.out.println(ce.toString());
		

	}	}

