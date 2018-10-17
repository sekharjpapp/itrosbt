package lambdaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .map(element->element * 2)
                .forEach((Integer value)-> System.out.print("\t"+value));
        System.out.println("\n ************");
        numbers.forEach((value)-> System.out.print(value));

        System.out.println("\n");
        List<Integer> nums = Arrays.asList(1,2,3,2);
        Set<Integer> even = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(even);
    }
}
