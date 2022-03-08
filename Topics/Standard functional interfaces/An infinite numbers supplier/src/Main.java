import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        // write your code here
        Integer[] numbers = {0};
        return () -> numbers[0]++;
    }

}