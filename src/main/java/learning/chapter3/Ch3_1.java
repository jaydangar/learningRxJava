package learning.chapter3;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_1 {
    //  conditional operators : takeWhile() -> pushes while condition is true, 
    //  takeUntil -> takes other observable as parameter and pushes till observable have data 
    //  skipWhile -> skips while condition is true 
    //  defaultIfEmpty() -> sends default value if null
    //  switchIfEmpty() -> sends values from other observables if the current observable is empty
    public static void main(String[] args) throws InterruptedException {
        Observable.range(1, 10).takeWhile(s->s<5).subscribe(s->System.out.println(s));
        Observable<String> observable = Observable.just("Hello");
        //  prints default value -> NONE
        observable.filter(s->s.startsWith("z")).defaultIfEmpty("NONE").subscribe(s->System.out.println(s));
        observable.filter(s->s.startsWith("z")).switchIfEmpty(Observable.just("Hi","Hello","How are you")).subscribe(s->System.out.println(s));
    }
}