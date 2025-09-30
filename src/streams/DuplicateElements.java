package streams;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {
    public static void main(String[] args) {

        Stream<Integer> stream=Stream.of(2,12,17,3,2);
        System.out.println(findDuplicateStream(stream));
    }

    public static <T> List<T> findDuplicateStream(Stream<T> stream)
    {
        Set<T> items = new TreeSet<>();
        return stream.filter(n -> !items.add(n)).collect(Collectors.toList());
    }
}
