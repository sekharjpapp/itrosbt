package reactivexprogramming;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func2;

public class ZipExample {
    public static void main(String[] args) {
        Observable<Integer> rangeMajor = Observable.range(1, 3);

        Observable<Integer> rangeMinor = Observable.range(5, 10);
        Observable.zip(rangeMajor, rangeMinor,
                new Func2<Integer, Integer, String>() {
                    @Override
// order of parameters here is the same order
// of zip parameters
                    public String call(Integer major, Integer minor) {
                        return major + "." + minor;
                    }
                }).subscribe(new Subscriber<String>() {
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
