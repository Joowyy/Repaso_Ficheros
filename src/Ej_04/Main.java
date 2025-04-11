package Ej_04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File f1 = new File("Ejercicio_04.txt");
		File f2 = new File("Ejercicio_04_Inv.txt");
		
		invertirTexto(f1, f2);
		
	}

	public static void invertirTexto (File f1, File f2) {
		
		try {
			
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			String linea;
			String limiteInvertido = "";
			
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
				
//				Invierte la linea
				for (int i = linea.length() - 1; i >= 0; i--) {
					
					limiteInvertido += linea.charAt(i);
					
				}
				
			}
			
			FileWriter fw = new FileWriter(f2);
			
//			Escribe la linea invertida
			fw.write(limiteInvertido);
			
			fr.close();
			br.close();
			fw.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}
	
}
