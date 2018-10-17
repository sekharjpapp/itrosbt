package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;

public class ConcatExample {
    public static void main(String[] args) {
        Observable<String> first =
                Observable.just("one", "two");
        Observable<String> second =
                Observable.just("three", "four", "five");
        Observable.concat(first, second)
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("sequence completed!");
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(String s) {
                        System.out.println("next item is: " + s);
                    }
                });
    }
}
