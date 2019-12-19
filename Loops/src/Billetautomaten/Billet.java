package Billetautomaten;

public class Billet {

    private double startTid;
    protected int antalMinutter;

    public Billet() {
    }

    public void setAntalMinutter(int antalMinutter) {
        this.antalMinutter = antalMinutter;
    }

    public int getAntalMinutter() {
        return antalMinutter;
    }
  

    public Billet(double startTid, int antalMinutter) {
        this.startTid = startTid;
        this.antalMinutter = antalMinutter;
    }

    @Override
    public String toString() {
        String formated = String.format("%.2f", startTid);
     

        return ("---------Billet--------\n" + "Start tid: " + formated + "\nAntal minutter: " + antalMinutter);
    }
}
