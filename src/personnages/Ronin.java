package personnages;

public class Ronin extends Humain  {
	private int honneur = 1;
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}
	
	public void donner(Commercant beneficiaire) {
		int argentdonne=(int) (getArgent()*0.1);
		beneficiaire.gagnerArgent(argentdonne);
		parler(beneficiaire.getNom()+"prend ces 6 sous.");
		beneficiaire.recevoir(argentdonne);
	}
	
	public void provoquer(Yakuza adversaire) {
		int advArgent=adversaire.getArgent();
		int argent=getArgent();
		if (honneur>=adversaire.getReputation()) {
			parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			gagnerArgent(advArgent);
			adversaire.perdreArgent(advArgent);
			honneur+=1;
			parler("Je t’ai eu petit yakusa!");
			adversaire.parler("J’ai perdu mon duel et mes "+advArgent+" sous, snif... J'ai déshonoré le clan de\r\n"
					+ "Warsong.");
		}
		else {
			perdreArgent(argent);
			honneur-=1;
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.parler("Ce ronin pensait vraiment battre "+adversaire.getNom()+" du clan de Warsong ?\r\n"
					+ "Je l'ai dépouillé de ses "+argent+" sous.");
		}
	}
}
