package streams;

import java.util.List;
import java.util.stream.Stream;

public class Slice {
    public static void main(String[] args) {

        Stream<Integer> stream=Stream.of(2,12,17,3,2);
        System.out.println(slice(stream,1,4));
    }

    public static <T> List<T> slice(Stream<T> stream, int startIndex, int endIndex )
    {
        return stream.skip(startIndex).limit(endIndex-startIndex+1).toList();
    }
}
