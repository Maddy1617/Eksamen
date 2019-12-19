package Billetautomaten;



public class BilletMain {
   
 
    public static void main(String[] args) {
        
     //   Billet billet = new Billet(10.30,120);
        BilletAutomat billetautomat = new BilletAutomat();
      //  System.out.println(billet.toString());
      //  System.out.println("Pris: "+billetautomat.udregner(billet)+"kr.");
        System.out.println(billetautomat.billetUdskriver(20));
        
       
    }

}
