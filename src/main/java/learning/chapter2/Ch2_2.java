package learning.chapter2;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

//  Instead of create, use We can pass into the just() method up to 10 items that we want to emit.
//  This will invoke onNext() for each one and then invoke onComplete() when they have all been pushed.

//  We can also use Observable.fromIterable() to emit the items from any Iterable type, such as a List, for example. It will also call onNext() for each element and then call onComplete() once all the elements are emitted. 
//  use fromIterable frequenctly to overcome limitation of just().
public class Ch2_2 {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        observable.subscribe(s -> System.out.println(s));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Observable<Integer> newObservable = Observable.fromIterable(() -> list.iterator());
        newObservable.subscribe(s->System.out.println(s));
    }
}