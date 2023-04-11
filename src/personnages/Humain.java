package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	

	public Humain(String nom, int argent, String boisson) {
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") -" + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " � " + prix
					+ " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir un " + bien
					+ " � 50 sous");
		}
	}

	public void gagnerArgent(int gain) {
		argent = argent + gain;

	}

	public void perdreArgent(int perte) {
		argent = argent - perte;
	}

	public void memoriser(Humain humain) {
		if (nbConnaissance<memoire.length) {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}else {
			for (int i = 0; i < memoire.length; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[memoire.length-1]=humain;
		}
	}

	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String texte="Je connais bcp de monde dont :";
		for (int i = 0; i < nbConnaissance; i++) {
			if (i==nbConnaissance-1) {
				texte+=memoire[i].getNom();
				
			}else {
				texte+=memoire[i].getNom()+",";
			}
		}
		System.out.println(texte);
	}
}
