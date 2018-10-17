package reactivexprogramming;

import io.reactivex.Observable;

public class ReactiveXSample {
    public static Observable<Integer> fakeUserInput(){
        return Observable.just(12,23,34,45)
                .map(num->num * 2);
    }
    public static void main(String[] args) {
        Observable.just("Hello from ReactiveX")
                .subscribe(line-> System.out.println(line));

        fakeUserInput()
                .subscribe(t-> System.out.println(t));
    }
}
