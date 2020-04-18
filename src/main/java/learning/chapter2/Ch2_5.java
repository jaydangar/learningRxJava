package learning.chapter2;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_5 {
    //  Range function prints from initial value upto the value specified after it...
    public static void main(String[] args) {
        //   prints 20 numbers, starting from 5
        Observable<Integer> observable = Observable.range(5, 20);
        observable.subscribe(s->System.out.println(s));
    }
}