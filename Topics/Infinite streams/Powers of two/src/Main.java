import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamUtils {

    public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
        return Stream.iterate(0, x -> x < n, x -> x + 1)
                .map(x -> (int) Math.pow(2, x)); // replace it with your code
    }
}