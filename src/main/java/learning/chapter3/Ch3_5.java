package learning.chapter3;

import java.util.HashMap;
import java.util.HashSet;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_5 {
    //  Collection Operation -> returns collection as a Single<List<T>> Observable 
    public static void main(String[] args) {
        //  toList creates list and returns Single<List<T>> object
        Observable<String> observable = Observable.just("Vijay","Jay","Ajay","Sam");
        observable.toList().subscribe(s->System.out.println(s));

        //  toSortedList will print in sorted order
        observable.toSortedList().subscribe(s->System.out.println(s));

        //  toMap will create a map with key,value pair with provided values...
        observable.toMap(s->s.length(),s->s).subscribe(s->System.out.println(s));

        //  toMultiMap will map multiple values to a single key
        observable.toMultimap(s->s.length(),s->s).subscribe(s->System.out.println(s));

        //  collect function is used to collect values inside specified collection
        observable.collect(HashSet<String>::new,HashSet::add).subscribe(s->System.out.println(s));
    }
}