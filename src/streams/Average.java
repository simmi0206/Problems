package streams;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(-1,9,5,6,1,5,3,2,4);
        double avg=list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);


    }
}
