package learning.chapter1;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;

// Example of transforming/operations on data
// Here we will be tranforming String by converting into its length.
public class Chapter1_2 {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Jay", "Vijay", "Ajay", "Sanjay");
        
        observable.map(new @NonNull Function<@NonNull String, Integer>() {
            @Override
            public @NonNull Integer apply(@NonNull String s) throws Throwable {
                return s.length();
            }
        }).subscribe(new @NonNull Consumer<@NonNull Integer>() {
            @Override
            public void accept(@NonNull Integer s) throws Throwable {
                System.out.println(s);
            }
        });
    }
}