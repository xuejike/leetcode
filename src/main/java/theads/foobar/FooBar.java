package theads.foobar;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;
    private Semaphore fooLock = new Semaphore(1);
    private Semaphore barLock = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;

    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            fooLock.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barLock.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barLock.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooLock.release();
        }
    }
}
