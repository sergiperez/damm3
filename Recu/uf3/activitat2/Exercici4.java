package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercici4 {
	public static void main (String[] args) throws FileNotFoundException {
		boolean fitxer=false;
		String ruta="";
		//lector de la pregunta anterior que el guardara
		Scanner lector = new Scanner(System.in);
		int linies=0;
		
		while(!fitxer){	
			//Demanem el fitxer
			System.out.println("Escriu el nom del fitxer:");
			ruta=lector.next();
			fitxer=comprovarFitxer(ruta);
		}	
		
		//Demanem les línies
		System.out.println("Escriu el nombre de línies a veure :");
		while(!lector.hasNextInt()){	
			//Demanem el fitxer
			System.out.println("Escriu el nombre de línies a veure :");
			lector = new Scanner(System.in);
		}
		linies=lector.nextInt();
		
		System.out.println(mostrarFitxer(new File(ruta),linies));
	}
	
	public static boolean comprovarFitxer(String ruta){
		File f = new File(ruta);
		return (f.exists()&& !f.isDirectory());
	}
	
	public static String mostrarFitxer(File file, int linies) throws FileNotFoundException {
		Scanner lector = new Scanner(file);
		String contingut="";
		int linia=0;
		while (lector.hasNextLine() && linia<linies){
			contingut+=lector.nextLine()+"\n";
			linia++;
		}
		lector.close();
		return contingut;
	}
	
}