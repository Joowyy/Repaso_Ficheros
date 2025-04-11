package Ej_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File f = new File("Ejercicio_01.txt");
		
		escribirFichero(f);
		
	}
	
	public static void escribirFichero (File f) {
		Scanner sc = new Scanner (System.in);
		
		try {
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
			System.out.println("¿Que frase deseas introducir?");
			String fraseUsu = sc.nextLine();
			
			while ((linea = br.readLine()) != null) {

			}
			
//			Se escribe despues de leer el archivo
			FileWriter fw = new FileWriter(f);
			fw.write(fraseUsu);
			
			fr.close();
			br.close();
			fw.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}

}
