package streams;

import java.util.stream.Stream;

public class StreamReuseExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 12, 17, 3, 2);

        // First terminal operation
        long count = stream.count();
        System.out.println("Count: " + count);

        // Reusing the same stream (this will throw an exception!)
        try {
            stream.forEach(n-> System.out.println(n)); // IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Cannot reuse stream: " + e);
        }
    }
}
