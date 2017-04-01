package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercici7 {
	public static void main (String[] args) throws FileNotFoundException {
		boolean fitxer=false;
		String ruta="",ruta2="";
		//lector de la pregunta anterior que el guardara
		Scanner lector = new Scanner(System.in);
		int linies=0;
		
		while(!fitxer){	
			//Demanem el fitxer
			System.out.println("Escriu el nom del fitxer origen:");
			ruta=lector.next();
			fitxer=comprovarFitxer(ruta,".txt");
		}	
		
		System.out.println("Escriu el nom del fitxer destí:");
		ruta2=lector.next();
		copiaFitxer(new File(ruta),new File(ruta2));
	}
	
	public static boolean comprovarFitxer(String ruta, String ext){
		File f = new File(ruta);
		return (f.exists()&& !f.isDirectory() && f.getName().substring(f.getName().length()-4).equals(ext));
	}
	
	public static void copiaFitxer(File file,File file2) throws FileNotFoundException {
		Scanner lector = new Scanner(file);
		String contingut="";
		while (lector.hasNextLine()){
			contingut+=lector.nextLine()+"\n";
		}
		lector.close();
		PrintWriter pw = new PrintWriter(file2);
		pw.write(contingut);
		pw.close();
	}
	
}