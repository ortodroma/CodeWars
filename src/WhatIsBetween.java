public class WhatIsBetween {
    public static int[] between(int a, int b) {

        int[] arr = new int[b - a+1];
        for (int i = 0; i < b - a+1; i++) {
            arr[i] = a + i;
        }
        return arr;
    }
}

