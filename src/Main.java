import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> run = new ArrayList<>();
        LinkedHashSet<Integer> abv = new LinkedHashSet<>();
        Random rn = new Random();
        int sum = 0;
        for (int i = 0; i < 50; i++){
            run.add(rn.nextInt(1,100));

        }
        for (int a :run) {
            abv.add(a);

        }
        for ( int d :abv) {
            sum+=d;
        }
        System.out.println(abv);
        System.out.println(sum);
    }
}
