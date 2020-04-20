package learning.chapter3;

import io.reactivex.rxjava3.core.Observable;

public class CH3_4 {
    //  Reducing Operators -> generally performed on finite set
    //  Conditional Operators -> checks conditions
    public static void main(String[] args) {
        //  count operator counter number of elements emmitted,
        Observable<Integer> observable = Observable.just(1,2,3,4);
        observable.count().subscribe(s->System.out.println(s));

        //  conditional opertors
        //  all() -> this operator checks condition for all values and returns false if any condition fails
        observable.all(i->i<3).subscribe(s->System.out.println(s));

        //  any() -> this operator checks condition for all values and returns true if any condition is true
        //  empty() -> checks if observable have empty value and returns true/false 
        //  contains() -> checks if specified item is contained/emmitted by observable
        //  sequenceEqual() -> checks if two sequences are equals (sequences contains same values)

        observable.any(i->i<3).subscribe(s->System.out.println(s));
        observable.filter(i->i<5).isEmpty().subscribe(s->System.out.println(s));
    }
}