import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {

        //   creating a stream from the List. The elements in the stream are taken from the List.
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i*2);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(e -> System.out.println(e));

        }
}
