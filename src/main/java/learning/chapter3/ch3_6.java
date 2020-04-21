package learning.chapter3;

import io.reactivex.rxjava3.core.Observable;

//  error handling/recovery 
public class ch3_6 {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(2,5,0,6);
        
        //  throws exception divide by zero
        observable.map(s->10/s).subscribe(s->System.out.println(s),e->e.printStackTrace());

        //  onErrorReturnItem will return Item instead of throwing the item and returns if Item is thrown
        observable.map(s->10/s).onErrorReturnItem(-1).subscribe(s->System.out.println(s),e->e.printStackTrace());

        
    }
}