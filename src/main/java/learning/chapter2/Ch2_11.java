package learning.chapter2;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

//  disposable is used to dispose the stream after use
public class Ch2_11 {
    public static void main(String[] args) throws Exception{
        Observable<Long> observable = Observable.interval(1,TimeUnit.SECONDS);
        Disposable disposable = observable.subscribe(s->System.out.println(s));
        Thread.sleep(5000);
        disposable.dispose();
        //  disposed, no more emissions...
        Thread.sleep(5000);
    }
}