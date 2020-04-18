package learning.chapter2;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Supplier;

//  Observable.defer() -> if you want to change the emission at runtime, this will be useful.
public class Ch2_7 {
    private static int start = 1;
    private static int count = 3;

    public static void main(String[] args) {
        // Observable<Integer> source = Observable.range(start, count);
        // source.subscribe(i -> System.out.println("Observer 1: " + i)); // modify count
        // count = 5;
        // source.subscribe(i -> System.out.println("Observer 2: " + i));

        // this will print updated values...
        Observable<Integer> observable = Observable.defer((@NonNull Supplier<? extends ObservableSource<? extends Integer>>) new Supplier<ObservableSource<? extends Integer>>() {
            @Override
            public ObservableSource<? extends Integer> get() throws Throwable {
                return Observable.range(start, count);
            }
        });
        observable.subscribe(s->System.out.println(s));
        count = 5;
        observable.subscribe(s->System.out.println(s));
    }
}