import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Kata {

    public static int[] sortTheOdd(int[] array) {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for (int number : array){
            if (number % 2 != 0){
            oddArray.add(number);
            }
        }
        Collections.sort(oddArray);
        int i = 0;
        int oddArrayIndex = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                array[i] = oddArray.get(oddArrayIndex);
                oddArrayIndex += 1;
            }
            i += 1;
        }
        return array;
    }

    public static boolean  isIsogram(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
                list.add(String.valueOf(ch).toLowerCase());
            }
            for (String ch : list){
                if (Collections.frequency(list,ch) > 1) return false;
            }
            return true;
    }

    public static String reverseWords(final String original) {

    }


}
