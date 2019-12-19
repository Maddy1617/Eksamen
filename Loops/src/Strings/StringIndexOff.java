package Strings;

public class StringIndexOff {
    public static void main(String[] args) {
        //IndexOf bruges til at finde indexpladsen for en bestemt char.
        //Man kan dog også sætte flere chars ind, og på den måde finde ud af,
        //Hvornår den del af ordet starter i forhold til indexplads. 
        
        String fruit = "banana";
        int index = fruit.indexOf('a',2);
        System.out.println(index);
    }
  
}
