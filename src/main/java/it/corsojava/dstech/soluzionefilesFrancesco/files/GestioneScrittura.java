package it.corsojava.dstech.soluzionefilesFrancesco.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class GestioneScrittura {

	private File file;

	public GestioneScrittura() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dammi il path del file su cui stampare");
		this.file = new File(scanner.nextLine());
	}
	
	public void stampaLista (List<String> lista) throws IOException {
		Files.write(Paths.get(this.file.getAbsolutePath()), lista);
	}
}
