package personnages;
public class Yakuza extends Humain {
	private int reputation=4;
	private String clan;
	public Yakuza(String nom, int argent, String boisson,String clan) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}
	
	public int getReputation() {
		return reputation;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de"+clan);
		
	}
	public void extorquer(Commercant victime) {
		int vicArgent = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		gagnerArgent(vicArgent);
		parler("J’ai piqué les "+vicArgent+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma\r\n"
				+ "poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argent=getArgent();
		perdreArgent(argent);
		parler("J’ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le clan de\r\n"
				+ "Warsong.");
		return argent;
	}
	
	public void gagner(int gain) {
		String nom=getNom();
		int argent= getArgent();
		gagnerArgent(gain);
		reputation+=1;
		parler("Ce ronin pensait vraiment battre"+nom+"du clan de Warsong ?\r\n"
				+ "Je l'ai dépouillé de ses "+argent+" sous.");
	}
}
