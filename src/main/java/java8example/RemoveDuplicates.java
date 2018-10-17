package java8example;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[] {5,3,7,9,2};

        Arrays.stream(nums).sorted().forEach(System.out::println);
    }
}
