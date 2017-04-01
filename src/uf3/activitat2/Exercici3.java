package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercici3 {
	public static void main (String[] args) throws FileNotFoundException {
		boolean fitxer=false;
		String ruta="";
		while(!fitxer){	
			//Demanem el fitxer
			System.out.println("Escriu el nom del fitxer:");
			//lector de la pregunta anterior que el guardara
			Scanner lector = new Scanner(System.in);
			ruta=lector.next();
			fitxer=comprovarFitxer(ruta);
		}	
		int[] stats = estadistiquesParaules(new File(ruta));
		for (int i=0; i< stats.length; i++)
			System.out.println("Línia "+(i+1)+" té "+stats[i]+" paraules");
	}
	
	public static boolean comprovarFitxer(String ruta){
		File f = new File(ruta);
		return (f.exists()&& !f.isDirectory());
	}
	
	public static int[] estadistiquesParaules(File file) throws FileNotFoundException {
		Scanner lector = new Scanner(file);
		int[] paraules=new int[liniesFitxer(file)];
		int i=0;
		//Es canvia on posa nextLine() per next()
		while (lector.hasNextLine()){
			paraules[i]=lector.nextLine().split(" ").length;
			i++;
		}
		lector.close();
		return paraules;
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