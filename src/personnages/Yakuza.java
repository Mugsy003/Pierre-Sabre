package personnages;
import personnages.Humain;
public class Yakuza extends Humain {
	public Yakuza(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}


	private String nom;
	private int reputation=0;
	
	
	public void extorquer(Commercant victime) {
		gagnerArgent(8);
		
	}
	
	
}
