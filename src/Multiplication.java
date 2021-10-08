public class Multiplication {
    public static String multiTable(int num) {

        /*return  "1 * " + num + " = " + num*1+ "\n" +
                "2 * " + num + " = " + num*2+ "\n" +
                "3 * " + num + " = " + num*3+ "\n" +
                "4 * " + num + " = " + num*4+ "\n" +
                "5 * " + num + " = " + num*5+ "\n" +
                "6 * " + num + " = " + num*6+ "\n" +
                "7 * " + num + " = " + num*7+ "\n" +
                "8 * " + num + " = " + num*8+ "\n" +
                "9 * " + num + " = " + num*9+ "\n" +
                "10 * " + num + " = " + num*10;*/

        /*StringBuilder a = new StringBuilder();

        for (int i = 1; i <=10; i++) {
            int result = i*num;
            a.append(i + " * " + num + " = " + result + "\n");
        }
            return  a.toString().trim();*/


       /* String arr[] = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
        }
        return String.join("\n", arr);  */

        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " * " + num + " = " + i * num + ((i < 10) ? "\n" : "");
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println(Multiplication.multiTable(5));
};


    }
