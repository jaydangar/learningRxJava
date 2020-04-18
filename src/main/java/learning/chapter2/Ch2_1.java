package learning.chapter2;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

//  Observable.Create will create a new Observable and to emit data from it use onNext method...
//  additionally we can perform map and filter operations...
public class Ch2_1 {
    public static void main(String[] args) {
        Observable<String> observable = Observable.create(emitter -> {
            try {
                emitter.onNext("Jay");
                emitter.onNext("Vijay");
                emitter.onNext("Ajay");
                emitter.onNext("Sanjay");
                emitter.onComplete();
            } catch (Exception e) {
                emitter.onError(e);
            }
        });
        observable.map((@NonNull String t) -> t.length())
                .filter((@NonNull Integer t) -> {
            if (t > 5) {
                return true;
            }
            return false;
        }).subscribe(s -> System.out.println(s), Throwable::printStackTrace);
    }
}