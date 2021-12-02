package prog2_2_startup;

public class Prog2 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);
        System.out.println("compute πx: "+Math.pow(Math.PI,x) + " and x="+x);
        System.out.println("compute yπ: "+Math.pow(y,Math.PI) + " and x="+y);
    }
}
