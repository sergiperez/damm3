package uf2.recuperacio;
public class Comptar_lletra_ADN {
	
	public static void main(String[] args) {
		/**
		 * maxNucleotidos és el número que indicarà quantes posicions tindrà l'array que guarda la seqüència de ADN.
		 * Valdrà entre 35 i 69.
		 */
		int maxNucleotidos = (int) (Math.random()*35)+35;
		/**
		 * sequenciaADN array que conté la seqüència per a analitzar.
		 */
		String[] sequenciaADN = new String[maxNucleotidos];
		/**
		 * Omplim de manera aleatòria la seqüència de ADN per així poder realitzar en cada execució una prova diferent.
		 */
		for(int n=0;n<maxNucleotidos;n++){
			sequenciaADN[n]=generaNucleotido();
		}
		
		String lletra="";
		java.util.Scanner lector = new java.util.Scanner(System.in);
		
		do{
			System.out.println("Quina lletra voleu cercar? (A|C|G|T)");
			lletra = lector.next();
		}while(!lletra.equals("A")&&!lletra.equals("C")&&!lletra.equals("G")&&!lletra.equals("T"));	
		
		/**
		 * 
		 */
		System.out.println("L'ADN és "+pintaADN(sequenciaADN)+" i la lletra a comptar és " +lletra);

		//TODO Aquí heu de posar la crida a la funció que ens retornarà el nombre de cops que apareix la lletra
		System.out.println("Apareix "+copsLletra(sequenciaADN,lletra)+" cops");
	}
	
	/**
	 * Funció que ens genera aleatòriament una A o C o G o T
	 * @return la lletra que representa el nucleotido.
	 */
	private static String generaNucleotido(){
		switch ((int) (Math.random()*4))
		{
			case 0: 
					return "A";
			case 1: 
					return "C";
			case 2: 
					return "G";
			default: 
					return "T";
		} 
	}
	
	/**
	 * Funció que donat un array el transforma en cadena.
	 * @return els valors de l'array units per , i així és una cadena
	 */
	private static String pintaADN(String[] array){
		String cadena="{";
		for(int i=0;i<array.length-1;i++){
			cadena+=array[i]+",";
		} 
		cadena+=array[array.length-1]+"}";
		return cadena;
	}
	
	private static int copsLletra(String[] sequenciaADN,String lletra){
		int cops=0;
		
		for(String l : sequenciaADN){
			if (l.equals(lletra)){
				cops++;
			}
		}
		return cops;
	}
}
