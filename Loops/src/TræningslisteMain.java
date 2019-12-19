



public class TræningslisteMain {
    public static void main(String[] args) throws Exception {
       Træningsliste træningsliste = new Træningsliste(10); // instantiere array med given størrelse

       
       
        
         for (int i = 1; i < 11; i++) {
         træningsliste.tilføjMedlem(i);
        }
            
         //træningsliste.tilføjMedlem(5);
   
         træningsliste.printArray();
      
     
       
    }
 
}
