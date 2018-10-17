package reactivexprogramming;

import io.reactivex.Observable;

public class RxFibonacci {
    public static Observable<Integer> fibs(){
        return Observable.create(subscriber->{
            int prev =0;
            int current=1;
            subscriber.onNext(0);
            subscriber.onNext(1);
            while (true){
                int oldPrev= prev;
                prev =current;
                current +=oldPrev;

                subscriber.onNext(current);
            }
                });
    }
    public static void main(String[] args) {
        fibs()
            .concatMapMaybe(x->RxFibonacci.fibs().elementAt(x))
            .blockingSubscribe(line-> System.out.println(line));
    }
}
