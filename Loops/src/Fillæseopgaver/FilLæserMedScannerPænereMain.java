package Fillæseopgaver;

public class FilLæserMedScannerPænereMain {
    public static void main(String[] args) {
      FilLæserMedScannerPænere f = new FilLæserMedScannerPænere();  
      f.openFile();
      f.readFile();
      f.closeFile();
    }
   
}
