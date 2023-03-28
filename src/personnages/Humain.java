package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String bien;
	private String boisson;
	
	
	public Humain(String Nom,int argent, String boisson) {
		this.argent=argent;
		this.boisson=boisson;
		this.nom=Nom;
	}
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String parler() {
		String texte = ("("+nom+") -");
		return texte;
	}
	public void direBonjour() {
		System.out.println(parler()+"Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson);
	}
	
	public void boire() {
		System.out.println(parler()+"Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	
	public void acheter(String bien,int prix) {
		if (argent>=prix) {
			System.out.println(parler()+"J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir une "+bien+" à "+prix+" sous");
			argent=argent-prix;
		}
		else {
			System.out.println(parler()+"Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas m'offrir un "+bien+" à 50 sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent=argent+gain;
		
	}
	
	public void perdreArgent(int perte) {
		argent=argent-perte;
	}
	
}

