package practice;

import java.util.stream.Stream;

public class StreamAOf {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(20, 30, 40, 50, 60, 9);
        stream.forEach(e -> System.out.println(e));

        Stream<String> stream1 = Stream.of("jdnvdkfh", "isfhskfh", "iuiefjksfh", "qieudh");
        stream1.forEach(e -> System.out.println(e));
    }
}
