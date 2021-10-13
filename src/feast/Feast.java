package feast;

import meanOfAnArray.MeanOfAnArray;

public class Feast {
    public static boolean feast(String beast, String dish) {
        boolean firstLetter = (beast.charAt(0) == dish.charAt(0)) ? true : false;
        boolean lastLetter = (beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) ? true : false;
        return (firstLetter && lastLetter) ? true : false;
    }

    //krajša verzija
    // return (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1))?true:false;


    public static void main(String[] args) {
        System.out.println(Feast.feast("brown bear", "bear claw"));
    }
}
