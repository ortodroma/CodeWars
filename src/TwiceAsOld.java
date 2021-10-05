public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int raz = 0;
        for (int i = 0; i < dadYears * 2; i++) {
            if (dadYears - sonYears == sonYears - i) {
                raz = i;
            } else if (dadYears - sonYears == sonYears + i) {
                raz = i;
            }
        }
        return raz;
    }
}
