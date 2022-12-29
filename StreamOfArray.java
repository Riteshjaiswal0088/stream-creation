import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {

        // creating a stream from the array. The elements in the stream are taken from the array.

        Stream<Integer> stream = Stream.of(new Integer[]{10, 90, 54, 94, 99, 33, 56});
        stream.forEach(e -> System.out.println(e));

        Stream<String> stream1 = Stream.of(new String[]{"abhi", "babita", "cheelati", "durga", "elkina"});
        stream1.forEach(e -> System.out.println(e));
    }
}
