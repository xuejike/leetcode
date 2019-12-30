package theads.hho;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class H2O {
    Semaphore hLock = new Semaphore(2);
    Semaphore oLock = new Semaphore(1);
    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        hLock.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        checkLockReset();
    }

    private synchronized void checkLockReset() {

        if (oLock.availablePermits()==0 && hLock.availablePermits() == 0){
            hLock.release(2);
            oLock.release();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        oLock.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        checkLockReset();

    }

}
