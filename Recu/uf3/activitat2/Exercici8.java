package uf3.activitat2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercici8 {
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
		
		//Demanem les línies
		System.out.println("Escriu el nombre de línies a veure del final de l'arxiu :");
		while(!lector.hasNextInt()){	
			//Demanem el fitxer
			System.out.println("Escriu el nombre de línies a veure :");
			lector = new Scanner(System.in);
		}
		linies=lector.nextInt();
		
		System.out.println(spoiler(new File(ruta),linies));
	}
	
	public static boolean comprovarFitxer(String ruta, String ext){
		File f = new File(ruta);
		return (f.exists()&& !f.isDirectory() && f.getName().substring(f.getName().length()-4).equals(ext));
	}
	
	public static String spoiler(File file,int linies) throws FileNotFoundException {
		Scanner lector = new Scanner(file);
		String contingut="";
		int i=0;
		//Llegim arxiu i guardem les línies al reves
		String[] liniesTotal = new String[liniesFitxer(file)];
		while (lector.hasNextLine()){
			liniesTotal[i]=lector.nextLine();
			i++;
		}
		lector.close();
		//count per comptar quantes línies anem escrivint
		int count=0;
		for(i=liniesTotal.length-1;i>=0 && count<linies;i--){
			contingut=liniesTotal[i]+"\n"+contingut;
			count++;
		}
		return contingut;
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