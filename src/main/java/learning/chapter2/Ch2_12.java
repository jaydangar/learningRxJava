package learning.chapter2;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.ResourceObserver;

public class Ch2_12 {
    // use of ResourceObserver,by which Disposable is handled by RxJava
    //  CompositeDisposables is used to manage multiple disposable at once
    public static void main(String[] args) {

        Observable<String> observable = Observable.just("Jay","Vijay");

        ResourceObserver<String> observer = new ResourceObserver<String>() {
            @Override
            public void onComplete() {
                // TODO Auto-generated method stub

            }

            @Override
            public void onError(@NonNull Throwable arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onNext(String arg0) {
                // TODO Auto-generated method stub
                System.out.println(arg0);
            }
        };
        //  return default disposable...
        Disposable disposable = observable.subscribeWith(observer);
        disposable.dispose();
    }
}