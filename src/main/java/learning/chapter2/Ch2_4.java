package learning.chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class Ch2_4 {
    // example of Hot Observable
    // If an Observer subscribes to a hot Observable, receives some emissions, and
    // then another Observer subscribes later, that second Observer will have missed
    // those emissions. Just like a radio station, if you tune in too late, you will
    // have missed that song.
    // any cold observable can be connected to hot observable using publish(), which
    // returns ConnectedObservable
    // following example prints only once..
    public static void main(String[] args) {
        ConnectableObservable<String> source = Observable.just("Alpha", "Beta", "Gamma").publish();
        // Set up observer 1
        source.subscribe(s -> System.out.println("Observer 1: " + s)); // Set up observer 2
        source.map(String::length).subscribe(i -> System.out.println("Observer 2: " + i)); // Fire!
        source.connect();

        
    }
}