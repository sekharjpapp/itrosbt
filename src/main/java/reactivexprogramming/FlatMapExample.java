package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        Observable.just(input)
                .flatMap(new Func1<List<Integer>, Observable<Integer>>() {
                    @Override
                    public Observable<Integer> call(List<Integer> item) {
                        return Observable.from(item);
                    }
                })
                .map(new Func1<Integer, String>() {
                    @Override
                    public String call(Integer t) {
                        return "Number " + t;
                    }
                })
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("sequence completed!");
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(String item) {
                        System.out.println("next item is: " + item);
                    }
                });
    }
}
