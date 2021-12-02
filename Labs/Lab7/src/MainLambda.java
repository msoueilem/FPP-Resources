import java.util.Arrays;

public class MainLambda {
    public static void main(String[] args) {
        String[] strings = {"aA","bfqwr3","aew42","hds"};
        StringSort st = new StringSort((s1,s2)-> s1.compareTo(s2));
        st.stringSort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
