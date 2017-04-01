package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercici6 {
	public static void main (String[] args) throws FileNotFoundException {
		boolean fitxer=false;
		String ruta="";
		//lector de la pregunta anterior que el guardara
		Scanner lector = new Scanner(System.in);
		int linies=0;
		
		while(!fitxer){	
			//Demanem el fitxer
			System.out.println("Escriu el nom del fitxer(ha de ser .txt,.csv,.json):");
			ruta=lector.next();
			String[] extensions={".txt",".csv",".json"};
			fitxer=comprovarFitxer(ruta,extensions);
		}	
		
		
		System.out.println(mostrarFitxer(new File(ruta)));
	}
	
	public static boolean comprovarFitxer(String ruta, String[] ext){
		File f = new File(ruta);
		boolean extensions = false;
		for(int i=0;i<ext.length;i++){
			if (f.getName().substring(f.getName().length()-ext[i].length()).equals(ext[i])){
				extensions=true;
			}
		}
		return (f.exists()&& !f.isDirectory() && extensions);
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