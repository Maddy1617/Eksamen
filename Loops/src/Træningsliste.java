
public class Træningsliste {
    private int[] liste = new int[0];
    

    public Træningsliste(int længde) {
        liste = new int[længde];
    }
    
    public void tilføjMedlem(int medlemsNummer) throws Exception {  
        for (int i = 0; i < liste.length; i++) {
           if(liste[i] == 0){ // checker hvis der er plads
          
               for (int j = 0; j < liste.length; j++) {
                   if(liste[j] == medlemsNummer){ // Checker hvis nr allerede eksisterer
                       throw new Exception("Dublikat");
                   }
                }
               liste[i] = medlemsNummer;
               break;
           }
           else if (i == liste.length -1){
               throw new ArrayIndexOutOfBoundsException("No more space");
           }
        }
    }
        
    public void printArray(){
            for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i]);
           }
        
        
    }
    
    
    
    
    
}
