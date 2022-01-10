package paulsMisery;

public class PaulsMisery {
    public static String paul(String[] x) {
        int Score=0;
        for (String activity:x){
            if (activity.equals("kata")) {
                Score+=5;
            } else if (activity.equals("Petes kata")) {
                Score+=10;
            }else if (activity.equals("eating")){
                Score+=1;
            }

        }
        return "Super happy"+Score;
    }
}
