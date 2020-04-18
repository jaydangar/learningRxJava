package learning.chapter1;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

//  Interval throws long at particular time, this code throws 1
public class Chapter1_3 {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
       
        observable.subscribe(new @NonNull Consumer<@NonNull Long>() {
            @Override
            public void accept(@NonNull Long s) throws Throwable {
                System.out.println(s);
            }
        });

        Thread.sleep(10000);
    }
}