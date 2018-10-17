package imparativevsdeclarative;

import java.util.*;
import java.util.stream.Collector;

public class LimitExample {
    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                .limit(3)
                .reduce((x,y)->x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList =Arrays.asList(5,6,7,8,9);

        Optional<Integer> integer = limit(integerList);
        if (integer.isPresent()){
            System.out.println(integer.get());
        }else {
            System.out.println("no Input");
        }
    }
}
