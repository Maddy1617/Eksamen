package Strings;

public class Strings1 {

    public static void main(String[] args) {
        // Du kan også bruge increment/decrement med characters i et for loop
        // her printer jeg hele alfabetet
        int count = 0;
        char c;

        for (c = 'A'; c <= 'Z'; c++) {
            count++;
            System.out.println(c);
        }
        System.out.println(count - 1);

    }
}
