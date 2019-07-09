package it.corsojava.dstech.esercizio4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//scrivere un oggetto che manda in output su file una lista di stringhe,
//su un file che legge da console

public class Esercizio4 {
	public static void main(String[] args) throws IOException {

		Scanner leggi = new Scanner(System.in);
		System.out.println("Inserisci path del file: ");
		String percorso = leggi.nextLine();

		File file = new File(percorso);
		List<String> lista = new ArrayList<String>();
		FileOutputStream stream = new FileOutputStream(file, true);
		PrintWriter write = new PrintWriter(stream);
		
		for (String string : lista) {
			write.append('\n');
			write.append(string);
		}		
		write.flush();
		write.close();

	}
}