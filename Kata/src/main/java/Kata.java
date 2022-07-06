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
        int offset = 0;
        int i = 0;
        StringBuilder result = new StringBuilder();
        for (char ch : original.toCharArray()){
            if (ch == ' '){
                offset = i + 1;
                result.insert(offset - 1, ch);
            }
            else result.insert(offset, ch);
            i++;
        }

        return result.toString();
    }

    public static int GetSum(int a, int b) {
        int result = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        while ( min <= max ) {
            result +=min;
            min++;
        }
        return result;
    }

    public static long findNb(long m) {
        long x = 0;
        long n = 1;
        long i = 3;
        while (x <= m){
            if (x == m) return n - 1;
            x += (long) Math.pow(n, i);
            n++;
        }
        return -1;
    }
}

