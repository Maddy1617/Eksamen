package Whileloops;

public class Incrementdecrement {

    public static void main(String[] args) {
        increment();
        decrement();
    }

    public static void increment() {
        int n = 0;
        while (n < 10) {
            System.out.println(n);
            n += 2;
        }
    }
    public static void decrement() {
        int n = 10;
        while (n >= 0) {
            System.out.println(n);
            n -= 2;
        }
    }
}
