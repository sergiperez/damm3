package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercici10 {
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
		//Llegim arxiu i guardem les línies al reves
		int i=0;
		String[] liniesTotal = new String[liniesFitxer(file)];
		while (lector.hasNextLine()){
			liniesTotal[i]=lector.nextLine();
			i++;
		}
		lector.close();
		for(i=liniesTotal.length-1;i>=0;i--){
			contingut+=liniesTotal[i]+"\n";
		}
		PrintWriter pw = new PrintWriter(file2);
		pw.write(contingut);
		pw.close();
	}
	
	public static int liniesFitxer(File f) throws FileNotFoundException{
		Scanner lector = new Scanner(f);
		int linies=0;
		
		//Es canvia on posa nextLine() per next()
		while (lector.hasNextLine()){
			String tmp=lector.nextLine()+"\n";
			linies++;
		}		
		return linies;
	}	
	
}