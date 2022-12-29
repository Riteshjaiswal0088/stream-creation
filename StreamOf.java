import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {

        // creating a stream of a fixed number of integers.
        Stream<Integer> strm = Stream.of(10, 55, 666, 95, 93, 003);
        strm.forEach(p -> System.out.println(p));

        // String
        Stream<String> stream = Stream.of("Ritesh", "Pramila", "priya", "Riya");
        stream.forEach(e -> System.out.println(e));

    }
}
