public class Travessa {
	static final int maxPartits=15;
	public static void main(String[] args) {
		
		/**
		 * partits matriu que conté els resultats a detectar
		 */
		int[][] partits = new int[maxPartits][2];
		/**
		 * Omplim de manera aleatòria els partits
		 */
		for(int p=0;p<maxPartits;p++){
			partits[p][0]=(int) (Math.random()*4);
			partits[p][1]=(int) (Math.random()*4);
		}
		
		/**
		 * 
		 */
		System.out.println("Els partits jugats són "+pintaJornada(partits));

		//TODO Aquí heu de posar la crida a la funció que ens retornarà el nombre de cops que apareix la lletra
		String[] travessa = generarTravessa(partits);
		System.out.println("La travessa és ");
		for(String signe : travessa){
			System.out.println(signe);
		}
	}
	
	
	/**
	 * Funció que donat una matriu el transforma en cadena.
	 * @return els valors de l'array units per , i així és una cadena
	 */
	private static String pintaJornada(int[][] matriu){
		String cadena="{";
		for(int p=0;p<maxPartits-1;p++){
			cadena+="{"+matriu[p][0]+",";
			cadena+=matriu[p][1]+"},";
		}
		cadena+="{"+matriu[maxPartits-1][0]+",";
		cadena+=matriu[maxPartits-1][1]+"}}";
		return cadena;
	}
	
	/**
	 * Funció que donat una matriu de resultats genera la travessa
	 * @return un array de 15 posicions on cada element serà 1 o X o 2 
	 */
	private static String[] generarTravessa(int[][] matriu){
		String[] resultats = new String[maxPartits];
		for(int p=0;p<maxPartits;p++){
			resultats[p]=signe(matriu[p]);
		}
		return resultats;
	}
	
	private static String signe(int[] resultat){
		if (resultat[0]>resultat[1]){
			return "1";
		}
		else{
			if (resultat[0]<resultat[1]){
				return "2";
			}
			else{
				return "X";
			}
		}
	}
	
	
}
