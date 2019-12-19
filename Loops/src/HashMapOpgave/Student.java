
package HashMapOpgave;

import java.util.ArrayList;

public class Student {
String navn;
int karakter;

    public Student(String navn, int karakter) {
        this.navn = navn;
        this.karakter = karakter;
    }

    public Student() {
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    

    public int getKarakter() {
        return karakter;
    }

    public void setKarakter(int karakter) {
        this.karakter = karakter;
    }
@Override
    public String toString() {
        return "Student{" + "navn=" + navn + ", karakter=" + karakter + '}';
    }


}
