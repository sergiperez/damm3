package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercici9 {
	public static void main (String[] args) throws FileNotFoundException {
		boolean fitxer=false;
		String ruta="",ruta2="";
		//lector de la pregunta anterior que el guardara
		Scanner lector = new Scanner(System.in);
		int linies=0;
		
		while(!fitxer){	
			//Demanem el fitxer
			System.out.println("Escriu el nom del fitxer:");
			ruta=lector.next();
			fitxer=comprovarFitxer(ruta,".txt");
		}	
				
		System.out.println(spoiler(new File(ruta),linies));
	}
	
	public static boolean comprovarFitxer(String ruta, String ext){
		File f = new File(ruta);
		return (f.exists()&& !f.isDirectory() && f.getName().substring(f.getName().length()-4).equals(ext));
	}
	
	public static String spoiler(File file,int linies) throws FileNotFoundException {
		Scanner lector = new Scanner(file);
		String contingut="",linia="";
		int i=0;
		//Llegim arxiu i guardem darrera línia
		while (lector.hasNextLine()){
			linia=lector.nextLine();
		}
		lector.close();
		//count per comptar quantes línies anem escrivint
		String[] paraules = linia.split(" ");
		for(i=0;i<paraules.length;i++){
			if (contingut.length()<paraules[i].length()){
				contingut=paraules[i];
			}
		}
		return contingut;
	}
	
	
}