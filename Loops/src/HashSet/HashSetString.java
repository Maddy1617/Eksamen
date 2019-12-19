package HashSet;
import java.util.*;
public class HashSetString {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>(/*bruges til at definere størrelse på Set*/);  
        hash.add("Mathias");
        hash.add("David");
        hash.add("Nop");
        hash.add("Gustav");
        hash.add("Uller");
        
        Iterator<String> itr = hash.iterator(); // Hvis du vil bruge et while loop til at itererer gennem et HashSet skal du også have en iterator
        //While loopet kører så længe, der er en String mere
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        for (String hej : hash) {
            System.out.println(hej);
        }
        //Hvis du vil tjekke om værdien bliver addet til hashsettet kan du:
        System.out.println(hash.add("Mathias"));
        // Jeg kalder det Object[] fordi HashSet er et Object og ikke en datatype, som String osv og ville derfor få en compile fejl hvis jeg brugte det. 
        Object[] myArr = hash.toArray();
        String value1 = myArr[0].toString();
     //   System.out.println(value1);
}
}