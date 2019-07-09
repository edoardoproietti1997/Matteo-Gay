package it.corsojava.dstech.esercizio4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//scrivere un oggetto che manda in output su file una lista di stringhe,
//su un file che legge da console

public class Esercizio4 {

	public static void ScriviSuFile(String path) throws IOException {

		FileOutputStream stream = new FileOutputStream(path, true);
		PrintWriter write = new PrintWriter(stream);
		List<String> lista = new ArrayList<String>();
		for (String string : lista) {
			write.append('\n');
			write.append(string);
		}
		write.flush();
		write.close();
	}
}