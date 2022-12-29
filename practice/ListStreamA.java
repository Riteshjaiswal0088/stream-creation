package practice;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ListStreamA {
    public static void main(String[] args) {
        var list = new ArrayList<>();
   /*     for (int i = 20; i > 0; i--) {
            list.add(i);
        }*/
      // list.forEach(System.out::println);
        IntStream.range(1, 20)
                .forEach(list::add);
        System.out.println(list);

    }
}
