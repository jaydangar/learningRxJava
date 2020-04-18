package learning.chapter2;

import io.reactivex.rxjava3.core.Maybe;

//  Maybe only omits one item only, even onError or onComplete won't be printed
//  if onSuccess prints (emits)
//  the following won't print on completed...
class Ch2_9{
    public static void main(String[] args) {
        Maybe<Integer> maybe = Maybe.just(5);
        maybe.subscribe(s->System.out.println(s),e->e.printStackTrace(),()->System.out.println("on completed..."));
    }   
}