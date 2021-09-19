import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        String word = String.valueOf(num);
        StringBuilder sbf = new StringBuilder();
        Character[] arr = new Character[word.length()];

        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (Character character : arr) {
            sbf.append(character);
        }

        return Integer.parseInt(String.valueOf(sbf));
    }
}