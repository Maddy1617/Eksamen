package Billetautomaten;



public class BilletAutomat {
  

    
   public int udregner(Billet billet) {
       
       int pris = 0;
       if (billet.getAntalMinutter() == 30) {
           pris = 20;

       } else if (billet.getAntalMinutter() == 60) {
           pris = 40;

       } else if (billet.getAntalMinutter() == 120) {
           pris = 60;

       } else if (billet.getAntalMinutter() == 360) {
           pris = 100;

       } return pris ;
   } 
       public Billet billetUdskriver(int beløb) {
        Billet billet = null;
       if (beløb == 20) {
            billet = new Billet(10.30,30);
       } else if (beløb == 40) {
          billet = new Billet(10.30,60);
       } else if (beløb == 60) {
           billet = new Billet(10.30,120);
       } else if (beløb == 100) {
           billet = new Billet(10.30,360);
       } 
       return billet; 
        
    } 


}
