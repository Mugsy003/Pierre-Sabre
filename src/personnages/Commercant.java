package personnages;

public class Commercant extends Humain{	
	public Commercant(String nom, int argent, String boisson) {
		super(nom, argent, "thé");
	}

	
	public int seFaireExtorquer() {
		int argent_local=getArgent();
		perdreArgent(getArgent());
		parler("J'ai tout perdu! Le Monde est trop injuste...");
		return argent_local;
	}
	
	public void recevoir(int argent) {
	parler(argent+" sous! Je te remercie genereux donateur!");
	}
	
}
