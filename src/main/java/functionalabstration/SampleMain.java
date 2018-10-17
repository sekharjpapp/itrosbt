package functionalabstration;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SampleMain {

    public static int totalValues(List<Integer> values, Predicate<Integer> selector){
        int result =0;
        for (int e:values){
            if (selector.test(e))
            result +=e;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(totalValues(nums,e -> true));
    }
}
