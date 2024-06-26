
//output will be thread1 1 thread2 2 

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckThread{
    private static final AtomicInteger count = new AtomicInteger(0);
    private static final AtomicBoolean firstIsDone = new AtomicBoolean(false);
    private static final AtomicBoolean secondIsDone = new AtomicBoolean(false);

    // change the below values to change the number of iterations each thread should 
    // run. In this example, the initial value are hard-coded but you can change 
    // them as well.
    private static final int finalOfFirstThread = 10;
    private static final int finalOfSecondThread = 109;

    public static void main(String[] args)
    {
        Runnable r1 = () -> {
            int i = 1;
            for(; i <= finalOfFirstThread; )
            {
                while(count.get() == 0)
                {
                    System.out.println(i+">>>" +Thread.currentThread().getName());
                    count.incrementAndGet();
                    i++;
                }
                if(count.get() == 1 && secondIsDone.get() && i != (finalOfFirstThread + 1))
                {
                    System.out.println(i+">>>" +Thread.currentThread().getName());

                    i++;
                }
            }
            firstIsDone.set(true);
        };

        Runnable r2 = () -> {
            int j = 100;
            for (; j <= finalOfSecondThread; )
            {
                while(count.get() == 1)
                {
                     System.out.println(j+">>>" +Thread.currentThread().getName());
                    count.decrementAndGet();
                    j++;
                }
                if(count.get() == 0 && firstIsDone.get() && j != (finalOfSecondThread + 1))
                {
                    System.out.println(j+">>>" +Thread.currentThread().getName());
                    j++;
                }
            }
            secondIsDone.set(true);
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}