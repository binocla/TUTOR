package binocla;

import java.util.stream.Stream;

public class MyTestProgram {
    public static void main(String[] args) {
        int min = Stream.of(1, 5, 2, 10, 0, 3).max(Integer::compareTo).get();
        System.out.println(min);
    }
}
