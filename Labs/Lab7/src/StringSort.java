import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    Comparator comparator;

    StringSort(Comparator<String> myComparator){
        this.comparator = myComparator;
    }

    public String[] stringSort(String[] arr){
        Arrays.sort(arr,comparator);
        return null;
    }

    static class LengthCompare implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            String string1 = (String) o1;
            String string2 = (String) o2;

            if(string1.length() > string2.length())
                return 1;
            return -1;
        }
    }
}
