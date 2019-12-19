package HashMapOpgave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArrayListKlasse {
    public static void main(String[] args) {
        addToArrayList();
    }
    public static void addToArrayList() {

        Student student = new Student();

        ArrayList<Student> studerende = new ArrayList(); 
        studerende.add(new Student("Mathias",12));
        studerende.add(new Student("Nikolaj",10));
        studerende.add(new Student("Gustav",7));
        studerende.add(new Student("David",00));
        studerende.add(new Student("Mikkel",00));
        studerende.add(new Student("Sebastian",00));
//        for (Student hej : studerende) {
//            System.out.println(hej);
            //.get() bruges til at tilgå element i ArrayList på bestemt indexplads
            System.out.println(studerende.get(1));
        }
//        Map<Boolean, ArrayList<Student>> map = new HashMap<>(); // det lort
//        
//        if(student.getKarakter() > 0) {
//        map.put(Boolean.TRUE, studerende);   
//        System.out.println(map.get(true));
//        }
//    }

}
