import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String args[]) {


        Observable<String> myStrings = Observable.just("Luv","Minki","Kush","ChoCho","Tam","Mum","Pup");
        myStrings.subscribe(s-> System.out.println(s));
        myStrings.map(s -> s.length()).subscribe(s ->  System.out.println(s));


        RunnableClass runnableClass = new RunnableClass();
        Thread t1 = new Thread(runnableClass);
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Executed T2");
            }
        });
        t2.start();

        Thread t3 = new Thread(()->{ System.out.println("Lamda Thread T3"); });
        t3.start();

        MyFunctionalInterface fun = ()->{
            System.out.println("My Methord Run");
        };
        fun.myMethord();

        passingLamdaFunction(()-> System.out.println("Passing Function to a Function"));

        MyFunctionalInterfaceWithParamater paramater = (a,b)->System.out.println(a+b);
        paramater.add(2234,2);





    }
    public static void passingLamdaFunction(MyFunctionalInterface funny){
        funny.myMethord();
    }


}
