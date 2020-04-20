package learning.chapter2;

import io.reactivex.rxjava3.core.Completable;

public class Ch2_10 {
    //  use of Completable, which runs a function (performs specified action), It can't receive any emission.
    public static void main(String[] args) {
        Completable.fromRunnable(new Runnable(){
            @Override
            public void run() {
                printIt();
            }
        }).subscribe(()->System.out.println("Action completed...")); 
    }

    static void printIt(){
        System.out.println("prints hello...");
    }
}