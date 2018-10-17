package removingduplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removing_Duplicate {
    public static void main(String[] args) {
        int[] intArray= {1,2,3,2};
        sort(intArray);

    }
    public static void sort(int [] arr){
        List<Integer> list= new ArrayList<>();
        for (int i:arr){
            list.add(i);
        }
        Set<Integer> set = new LinkedHashSet<>(list);

        for (Integer integer:set){
            System.out.print(integer);

        }
        Integer sum = set.stream()
                .mapToInt(a -> a)
                .sum();

        System.out.println(" Sum equals to: "+sum);


    }
}
