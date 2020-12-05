package atelier2b2;

public class ArticleEnSolde extends Article {

	private Double p;
	private Double nvprix;
		
		public ArticleEnSolde(String nom, Double prix, Double p) {
		super(nom, prix);
		this.p = p;
	}

		public Double getP() {
			return p;
		}

		public void setP(Double p) {
			this.p = p;
		}
		

		public Double getNvprix() {
			return nvprix;
		}

		public void setNvprix(Double nvprix) {
			this.nvprix = nvprix;
		}
		public void reduction(){
			// TODO Auto-generated method stub
			this.nvprix=this.getPrix()-this.getPrix()*this.getP();
		}

		@Override
		public void afficher() {
			// TODO Auto-generated method stub
			super.afficher();
			System.out.println("Le prix après la réduction de "+p*100+" % est : "+getNvprix());
		}
		


	}


