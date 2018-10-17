package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

public class FilterExample {
    public static void main(String[] args) {
        Observable.from(new Integer[]{2, 30, 22, 5, 60, 1})
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer x) {
                        return x > 10;
                    }
                }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("sequence completed!");
            }
            @Override
            public void onError(Throwable e) {
            }
            @Override
            public void onNext(Integer item) {
                System.out.println("next item is: " + item);
            }
        });
    }
}
