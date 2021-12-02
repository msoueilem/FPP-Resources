import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"aA","Safqwr3","aew42","ads"};
        StringSort.LengthCompare lengthCompare = new StringSort.LengthCompare();
        StringSort st = new StringSort(lengthCompare);
        st.stringSort(strings);

        System.out.println(Arrays.toString(strings));
    }
}
