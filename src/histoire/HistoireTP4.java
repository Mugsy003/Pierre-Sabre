package histoire;
import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Prof= new Humain("Prof",54,"kombucha");
		Prof.direBonjour();
		Prof.acheter("boisson", 12);
		Prof.boire();
		Prof.acheter("jeu", 2);
		Prof.acheter("kimono", 50);
		Commercant Marco= new Commercant("Marco", 20, "th�");
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		
	}
}
