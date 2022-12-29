import java.util.Random;
import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        // creating a stream from generated elements. This will produce a stream of 20 random numbers.
        // We have restricted the elements count using limit() function.

        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(50));
        randomNumbers.limit(20).forEach(System.out::println);


    }
}
