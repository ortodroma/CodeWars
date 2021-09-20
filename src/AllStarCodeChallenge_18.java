public class AllStarCodeChallenge_18 {
    public static int strCount(String str, char letter) {
        int sum = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == letter) {
                sum++;
            }
        }
        return sum;
    }
}