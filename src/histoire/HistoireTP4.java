package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Yakuza yaku= new Yakuza("Yaku Le Noir", 45, "sdiahdsj");
		Ronin roro= new Ronin("Roro",60,"shochu");
		roro.provoquer(yaku);
	}
}
