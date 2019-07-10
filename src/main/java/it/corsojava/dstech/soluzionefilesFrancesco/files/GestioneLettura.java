package it.corsojava.dstech.soluzionefilesFrancesco.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class GestioneLettura {
	private String path;
	private File file;
	public GestioneLettura() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire il path del file");
		this.path = scanner.nextLine();
		this.file = new File(this.path);
	}
	
	public List<String> leggiFile() throws IOException{
		List<String> listaStringhe = Files.readAllLines(Paths.get(this.path));
		return listaStringhe;
	}
}
