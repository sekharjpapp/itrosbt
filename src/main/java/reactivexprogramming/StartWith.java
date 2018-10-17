package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;

public class StartWith {
    public static void main(String[] args) {
        Observable.just("first", "second", "third")
                .startWith("zero")
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("sequence completed!");
                    }
                    @Override
                    public void onError(Throwable error) {
                    }
                    @Override
                    public void onNext(String item) {System.out.println("next item is: " + item);
                    }
                });
    }
}
