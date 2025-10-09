package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6);
        List<Integer> sorted=list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> ascendingSorted =list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(ascendingSorted);



    }
}
