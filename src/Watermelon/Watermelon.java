package Watermelon;

public class Watermelon {
    public static boolean divide(int weight) {

        if (weight > 2 && weight % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Watermelon.divide(5));
    }
}
