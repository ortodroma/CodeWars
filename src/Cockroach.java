import java.math.RoundingMode;

public class Cockroach{
    public static int cockroachSpeed(double x){
        int d=(int)Math.floor(x*100000/3600);
                return d;
    }


        public static void main(String[] args) {
            System.out.println(Cockroach.cockroachSpeed(5));
        }

}