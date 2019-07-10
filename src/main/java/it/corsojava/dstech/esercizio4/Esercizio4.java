package it.corsojava.dstech.esercizio4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//scrivere un oggetto che manda in output su file una lista di stringhe,
//su un file che legge da console

public class Esercizio4 {

	private String path;
	private List<String> list;

	public Esercizio4(String path) {
		this.path = path;
		List<String> list = new ArrayList<String>();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void scriviSuFile(String path) {

		try {
			FileOutputStream stream = new FileOutputStream(path, true);
			PrintWriter write = new PrintWriter(stream);
			for (String string : this.list) {
				write.append('\n');
				write.append(string);
			}
			write.flush();
			write.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}