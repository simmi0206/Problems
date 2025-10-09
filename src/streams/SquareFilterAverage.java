package streams;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAverage {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6,1,5,3,2,4);
        //squre,filter,avg
        double avg=list.stream()
                .map(e-> e*e)
                .filter(e-> e>10)
                .mapToInt(e->e)
                .average()
                .getAsDouble();
        System.out.println(avg);


    }
}
