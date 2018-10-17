package functionalabstration;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AnotherMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
       /* for (int e: list){
            System.out.println(e);
        }*/
        // External Iterator
        //Internal Iterator

//        list.forEach( System.out::println);

//        int reseult = 0;
       /* for (int e:list){
            if (e % 2 ==0){
                reseult += e *2;
            }
        }
        System.out.println(reseult);*/

      /* int factor = 3;

       int stream= list.stream()
                .filter(e->e % 2 ==0)
                .mapToInt(e->e * factor)
                .sum();

        System.out.println(stream);*/



    }
}
