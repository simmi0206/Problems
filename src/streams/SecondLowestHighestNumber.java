package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6,1,5,3,2,4,0,30,40);
        //second highest and second lowest
        int smax=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        int smin=list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(smin);
        System.out.println(smax);


    }
}
