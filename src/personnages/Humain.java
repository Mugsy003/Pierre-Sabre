package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	
	public Humain(String nom,int argent, String boisson) {
		this.argent=argent;
		this.boisson=boisson;
		this.nom=nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+") -"+texte); 
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	
	public void acheter(String bien,int prix) {
		if (argent>=prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir une "+bien+" � "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas m'offrir un "+bien+" � 50 sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent=argent+gain;
		
	}
	
	public void perdreArgent(int perte) {
		argent=argent-perte;
	}
	
}

