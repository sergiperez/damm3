public class Analisi_text {
    
    public static void main(String[] args) {
        /**
         * Es crrea l'objecte lector que ens fa de Scaner amb la particularitat que llegirÃ  quan es premi dos cops l'enter seguits. No un com Ã©s habitual
         * per aixÃ² l'Ãºs del mÃ¨tode useDelimiter.
         */
        java.util.Scanner lector = new java.util.Scanner(System.in).useDelimiter("\n\n");
        System.out.println("Escriviu el text que voleu analitzar (per acabar d'introduir el text heu de prímer l'enter dos cops seguits):");
        String text=lector.next();
        
        //TODO AquÃ­ heu de posar la crida a la funciÃ³ que ens anlaitza el text
        System.out.println("El text amb inicial de cada paraula en majúscules és"+majusculesText(text));
        System.out.println("Hi ha tantes paraules "+comptarParaules(text));
        System.out.println("Hi ha tants caràcters "+comptarCaracters(text));
        System.out.println("Hi ha tantes vocals "+comptarVocals(text));
        System.out.println("Hi ha tantes consonants "+comptarConsonants(text));
        
    }
    
    public static String majusculesText(String text){
        String[] paraules = text.split(" ");
        String textSortida= "";
        for (String paraula : paraules){
            textSortida+=paraula.substring(0,1).toUpperCase()+paraula.substring(1,paraula.length())+" ";
        }
        return textSortida;
    }
    
    public static int comptarParaules(String text){
        String[] paraules = text.split(" ");
        return paraules.length;
    }
    
    public static int comptarCaracters(String text){
        String[] paraules = text.split(" ");
        int comptador=0;
        for (String paraula : paraules){
            comptador+=paraula.length();
        }
        return comptador;
    }
    
    //No compta lletres amb accent
    public static int comptarVocals(String text){
        String[] paraules = text.split(" ");
        int comptaVocals=0;
        for (String paraula : paraules){
            for(int i=0;i<paraula.length();i++){
                if (paraula.toUpperCase().charAt(i)=='A' || paraula.toUpperCase().charAt(i)=='E' 
                		|| paraula.toUpperCase().charAt(i)=='I' || paraula.toUpperCase().charAt(i)=='O' 
                		|| paraula.toUpperCase().charAt(i)=='U' ) {
                    comptaVocals++;
                }
            }
        }
        return comptaVocals;
    }
    
    //Compta tot el que no sigui vocal
    public static int comptarConsonants(String text){
        String[] paraules = text.split(" ");
        int compta=0;
        for (String paraula : paraules){
            for(int i=0;i<paraula.length();i++){
            	if (!(paraula.toUpperCase().charAt(i)=='A' || paraula.toUpperCase().charAt(i)=='E' 
                		|| paraula.toUpperCase().charAt(i)=='I' || paraula.toUpperCase().charAt(i)=='O' 
                		|| paraula.toUpperCase().charAt(i)=='U' )) {
                    compta++;
                }
            }
        }
        return compta;
    }
    
}