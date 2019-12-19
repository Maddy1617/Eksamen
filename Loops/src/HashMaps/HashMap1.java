package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mathias", 26200059);
        int/*kan også være Integer*/ tlf = map.get("Mathias");
        System.out.println(tlf);
        System.out.println(map.get("Mathias"));
       //For at tjekke om en key med en værdi eksisterer i dit HashMap kan du bruge:
       if(map.containsKey("Mathias")) {
           System.out.println(1);
       }
       if(map.isEmpty()) {
           System.out.println("Den er tom");
       }
       //For at loope igennem keys, i HashMappet
       for(String s : map.keySet()) {
           System.out.println(s);
       }
       //For at loope gennem værdier, i HashMappet
       for(int a : map.values()) {
           System.out.println(a);
       }
    }
}
