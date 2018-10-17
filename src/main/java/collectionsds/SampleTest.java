package collectionsds;

import java.util.Arrays;
import java.util.List;

public class SampleTest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        //find sum of all elements in collection
        System.out.println(
                nums.stream()
                    .map(e->e * 2)
                    .reduce(0,(c,e)->c+e));

        System.out.println(
                nums.stream()
                    .filter(e->e > 3)
                    .filter(e->e % 2 ==0)
                    .map(e->e * 2)
                    .findFirst()
        );

    }
}
