package it.corsojava.dstech.soluzionefilesFrancesco.modelliDB;

public class StampaContrario {

	public static void stampa(String testa) {
		for (int i = testa.length() - 1; i >= 0; i--) {
			System.out.print(testa.charAt(i));
		}
	}
}
