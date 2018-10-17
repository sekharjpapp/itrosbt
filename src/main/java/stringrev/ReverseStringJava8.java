package stringrev;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringJava8 {
    public static void main(String[] args) {
        String abc = "abc";
        System.out.println(new StringBuilder(abc).reverse().toString());

        String xyz = "def";
        String reverse = Arrays.asList(xyz).stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList()).get(0);
        System.out.println(reverse);
    }

}
