package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6,1,5,3,2,4);
        List<Integer> even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println(odd);



    }
}
