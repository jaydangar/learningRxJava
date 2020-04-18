package learning.chapter2;

import io.reactivex.rxjava3.core.Observable;

//  example of cold observable
//  a cold Observable replays the emissions to each Observer, ensuring that it gets all the data.
public class Ch2_3 {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Jay","Vijay","Ajay");
        observable.subscribe(s->System.out.println(s));
        observable.map(String::length).filter(s->s>3).subscribe(s->System.out.println(s));
    }
}