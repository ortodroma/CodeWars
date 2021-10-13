package meanOfAnArray;

public class MeanOfAnArray {
    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        int average = sum / marks.length;
        return average;
    }



}

