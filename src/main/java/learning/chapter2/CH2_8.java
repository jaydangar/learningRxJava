package learning.chapter2;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;

//  using Single (type of Observable), which omits only 1 output
//  Single does not have onNext, instead it combines onComplete and onNext into onComplete only...
//  you can convert Single into Observable using toObservable() and viceversa using first()...
//  The difference between Maybe and Single is, Maybe may omit or may not be...
public class CH2_8 {
    public static void main(String[] args) {
        Single<Integer> single = Single.just(5);

        single.subscribe(s -> System.out.println(s));

        single.subscribe(new SingleObserver<Integer>() {
            @Override
            public void onError(@NonNull Throwable arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onSubscribe(@NonNull Disposable arg0) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void onSuccess(@NonNull Integer arg0) {
                // TODO Auto-generated method stub
                System.out.println(arg0);
            }
        });
    }
}