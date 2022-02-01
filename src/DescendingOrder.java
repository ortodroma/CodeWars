import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

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


    public static int sortDescLambda(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining())
        );
    }

}