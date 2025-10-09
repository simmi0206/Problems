package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6,1,5,3,2,4);
        //get first 5 numbers
        List<Integer> limit=list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limit);

        //get sum of first 5 numbers
        int sum =list.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(sum);

        //skip
        List<Integer> skip=list.stream().skip(5).collect(Collectors.toList());
        System.out.println(skip);

        //skipSum
        int skipsum =list.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println(skipsum);
    }
}
