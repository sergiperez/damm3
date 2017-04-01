package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercici5 {
	public static void main (String[] args) throws FileNotFoundException {
		boolean fitxer=false;
		String ruta="";
		//lector de la pregunta anterior que el guardara
		Scanner lector = new Scanner(System.in);
		int linies=0;
		
		while(!fitxer){	
			//Demanem el fitxer
			System.out.println("Escriu el nom del fitxer(ha de ser .txt):");
			ruta=lector.next();
			fitxer=comprovarFitxer(ruta,".txt");
		}	
		
		
		System.out.println(mostrarFitxer(new File(ruta)));
	}
	
	public static boolean comprovarFitxer(String ruta, String ext){
		File f = new File(ruta);
		return (f.exists()&& !f.isDirectory() && f.getName().substring(f.getName().length()-4).equals(ext));
	}
	
	public static String mostrarFitxer(File file) throws FileNotFoundException {
		Scanner lector = new Scanner(file);
		String contingut="";
		while (lector.hasNextLine()){
			contingut+=lector.nextLine()+"\n";
		}
		lector.close();
		return contingut;
	}
	
}