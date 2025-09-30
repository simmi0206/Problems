package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllDuplicateElements {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 12, 17, 3, 2, 12, 2);

        List<Integer> duplicates = findAllDuplicates(stream);
        System.out.println(duplicates);
    }

    public static <T> List<T> findAllDuplicates(Stream<T> stream) {
        Map<T, Long> counts = stream.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return counts.entrySet().stream()
                .filter(e -> e.getValue() > 1)  // only duplicates
                .flatMap(e -> Stream.generate(() -> e.getKey()).limit(e.getValue())) // repeat each duplicate
                .collect(Collectors.toList());
    }
}
