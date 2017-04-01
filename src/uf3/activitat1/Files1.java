package uf3.activitat1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("Reals.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("PRova");
		bw.close();
	}

}
