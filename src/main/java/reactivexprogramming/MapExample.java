package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

public class MapExample {

    public static void main(String[] args) {
        Observable.just(1, 2, 3)
                .map(new Func1<Integer, Integer>() {
                    @Override
                    public Integer call(Integer x) {
                        return x * 10;
                    }
                })
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("next item is: " + integer);
                    }
                });
    }
}
