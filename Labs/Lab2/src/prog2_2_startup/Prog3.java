package prog2_2_startup;

public class Prog3 {
    public static void main(String[] args) {
        float a = (float) 1.27;
        float b = (float) 3.881;
        float c = (float) 9.6;
        System.out.println("Sum by casting the sum to type int: " +(int)(a+b+c));
        System.out.println("Sum by rounding the sum to the nearest integer: " +Math.round(a+b+c));
    }
}
