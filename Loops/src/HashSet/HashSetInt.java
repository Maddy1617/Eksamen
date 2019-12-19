package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetInt {
    public static void main(String[] args) {
        
    
      HashSet<Integer> hash = new HashSet<>(/*bruges til at definere størrelse på Set*/);   
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);
        
        for (int i : hash) {
            System.out.println(i);
        }
}
}