package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

public class OddNumbersExample {
    public static void main(String[] args) {
        Observable.just( 2, 4,  6)
                .filter( value -> value % 2 ==1).subscribe(new Subscriber() {
                    @Override
                    public void onCompleted() {
                        System.out.println("sequence completed!");
                    }
                    @Override
                    public void onError(Throwable e) {
                        System.out.println("nothing ...");
                    }

            @Override
            public void onNext(Object o) {
                System.out.println("next item: " + o);
            }



                });
    }
}
