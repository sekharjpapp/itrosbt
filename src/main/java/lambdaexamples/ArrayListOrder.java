package lambdaexamples;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class ArrayListOrder {
    public static void main(String[] args) {
        List<String> orderlist = new ArrayList<>();
        orderlist.add("c1,o1");
        orderlist.add("c2,o2");
        orderlist.add("c1,o2");
        orderlist.add("c2,o3");

        System.out.println(orderlist.stream().sorted().collect(toList()));

        String s = "abc";
        System.out.println(s+"def");
        System.out.println(s.toUpperCase());
        System.out.println();

        int i1 =10;
        int i2 = 3;


    }
}
