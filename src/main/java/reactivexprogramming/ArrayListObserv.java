package reactivexprogramming;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class ArrayListObserv {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Observable.just(list)
                .subscribe(line-> System.out.println(line));

        String[] persons = new String[] {"Joe", "Jane", "John", "Phil"};
        Observable.fromArray(persons)
                .buffer(2, 1)
                .subscribe((personList)->{System.out.println(personList);});
    }
}
