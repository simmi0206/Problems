package streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,5,6,1,5,3,2,4,4);
//        Set<Integer> dip=list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
//        System.out.println(dip);

        Set<Integer> set=new HashSet<>();
        Set<Integer> result=list.stream().filter(e-> !set.add(e)).collect(Collectors.toSet());
        System.out.println(result);



    }
}
