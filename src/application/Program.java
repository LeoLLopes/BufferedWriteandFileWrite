package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};
		
		String path = "/home/leonardo/Documentos/workspace-eclipse/texto.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
