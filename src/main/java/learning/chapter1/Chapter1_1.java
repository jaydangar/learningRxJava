package learning.chapter1;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

//  Observables (Conveyer belt) can emit discrete as well as infinite data, 
//  Observables can subscribe to Observers (Interface) in order to emit the data.
class ObserverImplementationClass implements Observer<String>{
    
    @Override
    public void onComplete() {
        // TODO Auto-generated method stub
        System.out.println("Completed...");
    }

    @Override
    public void onError(@NonNull Throwable arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onNext(@NonNull String arg0) {
        // TODO Auto-generated method stub
        System.out.println(arg0);
    }

    @Override
    public void onSubscribe(@NonNull Disposable arg0) {
        // TODO Auto-generated method stub
        System.out.println("is disposed? " + arg0.isDisposed());
    }

}

public class Chapter1_1 {

    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.just("Jay","Vijay","Ajay","Sanjay");
        stringObservable.subscribe(new ObserverImplementationClass());
        // lambda expression
        stringObservable.subscribe(s -> System.out.println(s));
    }
}