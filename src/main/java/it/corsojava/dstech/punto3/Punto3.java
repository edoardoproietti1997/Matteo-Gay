package it.corsojava.dstech.punto3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Punto3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserire il path del file");
		List<String> listino = new ArrayList<String>();
		File file = new File(scanner.nextLine());
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("an error occored");
			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(reader);
		String s = null;
		try {
			while ((s = buffer.readLine()) != null) {
				System.out.println(s);
				listino.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listino.size(); i++) {
			System.out.println(" ");
			System.out.println(i + " --> " + listino.get(i));
		}
	}
}