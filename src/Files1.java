import java.io.File;
import java.util.Scanner;

public class Files1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\sergi.perez\\Desktop\\Reals.txt");
		try{
			Scanner lector = new Scanner(f);
			//Llegir a línia a línia l'arxiu
			double max=0;
			while(lector.hasNextDouble()){
				double n = lector.nextDouble();
				if (max < n){
					max=n;
				}
			}
			System.out.println("El màxim és "+max);
			lector.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
