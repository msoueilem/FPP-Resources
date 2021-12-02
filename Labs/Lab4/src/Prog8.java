public class Prog8 {
    private static int minA;
    static int min(int[] arrayOfInts) {
        minA = arrayOfInts[0];
        for (int i =0; i<arrayOfInts.length;i++) {
            if(arrayOfInts[i]<minA){
                minA = arrayOfInts[i];
            }
        }
        return minA;
    }
}
