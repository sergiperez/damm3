package uf3.activitat1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kahoot {


	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("/Users/raquel/git/damm3/src/uf3/activitat1/alumnes.txt");
		Scanner lector = new Scanner(f);
		lector.nextLine();
		lector.nextLine();
		System.out.println(lector.nextLine());
	}	
					
}


