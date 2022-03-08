import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    /**
     * Returns the sorted array of absolute numbers in ascending order.
     *
     * @param numbers the input array of String integer numbers
     * @return the sorted array of integer absolute numbers
     */


    // Don't change the code below
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Costa Rica", "Greece", "Malaysia", "Peru");


        List<Integer> numbers = countries.stream()
                .map(country -> country.split("\\s+"))
                .flatMap(Arrays::stream)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}