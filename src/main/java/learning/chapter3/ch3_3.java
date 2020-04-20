package learning.chapter3;

import java.util.Comparator;

import io.reactivex.rxjava3.core.Observable;

//  transforming operators..
public class ch3_3 {
    public static void main(String[] args) {
        //  map function converts one to one transformation, such as converting String into Int length by following example...
        Observable<String> observable = Observable.just("Jay","Vijay");
        System.out.println("printing output of map");
        observable.map(s->s.length()).subscribe(s->System.out.println(s));

        // startWithItem operator will be used to omit specified item first
        // startWithArray operator will be used to omit many items
        //  startWithIterator is the same as startWithArray
        System.out.println("printing output of startwithItem");
        observable.startWithItem("This will be ommitted first").subscribe(s->System.out.println(s));

        //  sorted will sort emission, use Comparator to sort in ascending/descending sorting
        Observable<Integer> observable2 = Observable.just(5,3,7,1,9,2);
        System.out.println("printing output of sorted");
        observable2.sorted(Comparator.reverseOrder()).subscribe(s->System.out.println(s));

        //  scan will combine the values and perform action (best for infinite values)
        //  reduce is similar but will output last values only (best for finite values)
        System.out.println("printing output of scan");
        observable2.scan((accumulator,i)->accumulator+i).subscribe(s->System.out.println(s));

        System.out.println("printing output of reduce");
        observable2.reduce((accumulator,i)->accumulator+i).subscribe(s->System.out.println(s));
    }
}