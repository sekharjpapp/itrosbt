package primenumjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toList;

public class PrimeNum {
    public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 20);
        //IntStream numbers =IntStream.range(2,20);
        // Prime number
        System.out.println(
                numbers.stream()
                .filter(PrimeNum::isPrime)
                .collect(toList()));
    }
    public static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
    }
}
