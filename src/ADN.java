public class ADN {
	
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
		/**
		 * 
		 */
		System.out.println("L'ADN a analitzar és "+pintaADN(sequenciaADN));
		
		//TODO Aquí heu de posar la crida a la funció que ens retornarà el nombre de cops que apareix purina (GA) en la seqüència de ADN
		System.out.println("La purina apareix "+copsPurina(sequenciaADN)+" cops");
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
	
	private static int copsPurina(String[] sequenciaADN){
		int cops=0;
		
		for(int lletra=0; lletra < sequenciaADN.length-1;lletra++){
			
			if (sequenciaADN[lletra].equals("G") && sequenciaADN[lletra+1].equals("A")){
				cops++;
			}
		}
		return cops;
	}
}
