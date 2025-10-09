package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6,1,5,3,2,4);
        int max=list.stream().mapToInt(e->e).max().getAsInt();
        int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        System.out.println(min);


    }
}
