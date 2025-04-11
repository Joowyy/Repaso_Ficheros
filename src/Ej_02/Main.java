package Ej_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File f = new File("LoremIpsum.txt");
		
		//estadisticasTexto(f);
		
//		Comprobacion de la palabra
		String palabraBuscar;
		boolean palabraCorrecta = false;
		
		while (!palabraCorrecta) {
		
			System.out.println("¿Que palabra deseas buscar?");
			palabraBuscar = sc.nextLine();
		
			if (palabraBuscar.contains(" ")) {
			
				System.out.println("Introduce una palabra válida.");
				break;
			
			} else {
				
				buscarPalabra(f, palabraBuscar);
				palabraCorrecta = true;
				
			}
		
		}
		
	}
	
	public static void estadisticasTexto(File f) {
		
		try {
			
//			Paquetes
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
//			Variables
			int contadorLinea = 0;
			int contadorPalabra = 0;
			int contadorLetra = 0;
			String linea;
			
//			Lector de estadisticas
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
				
				contadorLinea++;
				String[] palabras = linea.split(" ");
				
				for (int i = 0; i < palabras.length; i++) {
					
					contadorPalabra++;
					
					contadorLetra += palabras[i].length();
					
				}
				
			}
			
//			Resultados
			System.out.println();
			System.out.println("Numero de lineas -> " + contadorLinea);
			System.out.println("Numero de palabras -> " + contadorPalabra);
			System.out.println("Numero de letras -> " + contadorLetra);
			
//			Cierres
			fr.close();
			br.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}
	
	public static void buscarPalabra(File f, String palabraBuscar) {
		
		try {
			
//			Paquetes
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
//			Variables
			int contadorLinea = 0;
			int contadorPalabraEsp = 0;
			String linea;
			
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
				contadorLinea++;
				
				String[] palabras = linea.split(" ");
				
				for (int i = 0; i < palabras.length; i++) {
					
					if (palabras[i].equalsIgnoreCase(palabraBuscar) || palabras[i].equalsIgnoreCase(palabraBuscar + ".")) {
						
						System.out.println();
						System.out.println("Esta en la linea -> " + contadorLinea);
						contadorPalabraEsp++;
						
					}
					
				}
				
			}
			
			System.out.println();
			System.out.println("Numero de la palabra a buscar -> " + contadorPalabraEsp);
			
			fr.close();
			br.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}

}
