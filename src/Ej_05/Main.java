package Ej_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File f1 = new File("Ejercicio_05.txt");
		File f2 = new File("Ejercicio_05_Pro.txt");
		
		filtroProhibidas(f1, f2);
		
	}
	
	public static void filtroProhibidas (File f1, File f2) {
		
//		Palabras prohibidas
		final String palabraPro_01 = "feo";
		final String palabraPro_02 = "tonto";
		final String palabraPro_03 = "culo";
		final String palabraPro_04 = "te";
		
		try {
			
//			Paquetes
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(f2);
			
//			Variables
			String linea;
			
			while ((linea = br.readLine()) != null) {

//				Una linea nuevo por cada palabra agregada
				linea = linea.replace(palabraPro_01, "***");
	            linea = linea.replace(palabraPro_02, "***");
	            linea = linea.replace(palabraPro_03, "***");
	            linea = linea.replace(palabraPro_04, "***");

	            fw.write(linea + "\n");
				
			}
			
			fr.close();
			br.close();
			fw.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}

}
