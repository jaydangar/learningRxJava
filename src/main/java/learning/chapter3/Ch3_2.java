package learning.chapter3;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

//  suppressing operators
public class Ch3_2 {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> observable = Observable.just("Jay","Vijay","Ajay");
        //  filters based on condition and prints emmited data...
        observable.filter(s->s.length()!=3).subscribe(s->System.out.println(s));

        //  take will print number of items based on first come first serve and will print items specified,
        //  another version of take prints based on time duration,
        //  opposite of take is skip, which skips first n emmissions...
        //  other variant of skip is skipLast, which skips last n elements...
        //  prints first 2 items only
        observable.take(2).subscribe(s->System.out.println(s));

        //  waits till 5 seconds, whatever emmited in those 5 seconds will be printed, nothing afterwards..
        Observable.interval(1, TimeUnit.SECONDS).take(5,TimeUnit.SECONDS).subscribe(i->System.out.println("Hello " + i));
        Thread.sleep(10000);

        //  distinct -> print distinct values only, based on comparison (emits repeated value but filters based on previous value)
        //  distinctUntilChanged -> a better version of the first one, which don't emit until next value changes...

        //  elementAt() -> returns element based on index
        //  another version for elementAt is elementAtOrError() which returns error if element is not present 
    }
}