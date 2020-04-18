package learning.chapter2;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

//  Example on Interval with Hot and Cold Observable...
public class Ch2_6 {
    public static void main(String[] args) throws InterruptedException {
        
        //  cold observable...
        Observable<Long> observable = Observable.interval(1,TimeUnit.SECONDS);
        observable.subscribe(s->System.out.println(s));
        Thread.sleep(3000);
        observable.subscribe(s->System.out.println(s));
        Thread.sleep(3000);

        //  hot observable...
        ConnectableObservable<Long> hotObservable = Observable.interval(1,TimeUnit.SECONDS).publish();
        hotObservable.subscribe(s->System.out.println(s));
        hotObservable.connect();
        Thread.sleep(3000);
        hotObservable.subscribe(s->System.out.println(s));
        Thread.sleep(3000);
    }
}