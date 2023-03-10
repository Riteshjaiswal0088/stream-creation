package practice;

import java.util.Random;
import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
        randomNumbers.limit(25).forEach(System.out::println);
    }
}
