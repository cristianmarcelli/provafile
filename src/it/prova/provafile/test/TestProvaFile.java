package it.prova.provafile.test;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
//Per scrivere su un file
import java.io.FileWriter;

public class TestProvaFile {
	public static void main(String[] args) throws IOException {

		String pathname = "NewFile.txt";
		File fileDiProva = new File(pathname);

		if (fileDiProva.createNewFile())
			System.out.println("File created with filename: " + fileDiProva.getName());
		else
			System.out.println("File already exists");
		// Ora trovo il file "NewFile.txt"creato dentro la directory del progetto
		// provafile

		System.out.println("File name: " + fileDiProva.getName());
		System.out.println("File path: " + fileDiProva.getAbsolutePath());
		System.out.println("Available space in bytes: " + fileDiProva.getFreeSpace());
		System.out.println("Path: " + fileDiProva.getPath());
		System.out.println("Total space in bytes: " + fileDiProva.getTotalSpace());
		System.out.println("Usable space in bytes: " + fileDiProva.getUsableSpace());

		// Scrittura di un file - FileWriter()
		String filename = "NewFile.txt";
		FileWriter fw = new FileWriter(filename);
		fw.write("Welcome to File handling in Java");

		fw.close();
		System.out.println("File write operation completed");

		// Lettura di un file - FileReader()
		String filename2 = "NewFile.txt";
		char[] content = new char[100];
		FileReader fileR = new FileReader(filename2);
		try {
			fileR.read(content);
			System.out.println("Contents in the file:");
			System.out.println(content);
			fileR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Ora provo a riscrivere il file, aggiungendo la stringa "HELLOWORLD", verrà
		// quindi sostituito il contenuto precedente, ovevro: "Welcome to File handling
		// in Java"
		FileWriter fw2 = new FileWriter(filename2);
		fw.write("HELLO WORLD");

		System.out.println(content);

		fw.close();
		
		// Eliminazione di un file - delete()
		File f = new File("NewFile.txt");
	    
	    boolean fdel = f.delete();
	    if(fdel)
	      System.out.println("File is deleted");
	    else
	      System.out.println("File is not deleted");

	}

}
