import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;

/**
 * @class SimpleSemaphore
 * 
 * @brief This class provides a simple counting semaphore implementation using
 *        Java a ReentrantLock and a ConditionObject. It must implement both
 *        "Fair" and "NonFair" semaphore semantics, just liked Java Semaphores.
 */
public class SimpleSemaphore {
    /**
     * Constructor initialize the data members.
     */

    public SimpleSemaphore(int permits, boolean fair) {
        // TODO - you fill in here
        mRLock = new ReentrantLock(fair);
        mCond = mRLock.newCondition();
        mAtomic = new SimpleAtomicLong(permits);
        mPermits = permits;
    }

    /**
     * Acquire one permit from the semaphore in a manner that can be
     * interrupted.
     */
    public void acquire() throws InterruptedException {
        // TODO - you fill in here
        mRLock.lockInterruptibly();
        try {
            while (mAtomic.get() == 0) {
                mCond.await();
            }
            mAtomic.decrementAndGet();
        } finally {
            mRLock.unlock();
        }
    }

    /**
     * Acquire one permit from the semaphore in a manner that cannot be
     * interrupted.
     */
    public void acquireUninterruptibly() {
        // TODO - you fill in here
        mRLock.lock();
        try {
            while (mAtomic.get() == 0) {
                mCond.awaitUninterruptibly();
            }
            mAtomic.decrementAndGet();
        } finally {
            mRLock.unlock();
        }
    }

    /**
     * Return one permit to the semaphore.
     */
    void release() {
        // TODO - you fill in here
        mRLock.lock();
        try {
            mAtomic.incrementAndGet();
            mCond.signal();
        } finally {
            mRLock.unlock();
        }
    }

    /**
     * Define a ReentrantLock to protect the critical section.
     */
    // TODO - you fill in here
    private ReentrantLock mRLock;
    /**
     * Define a ConditionObject to wait while the number of permits is 0.
     */
    // TODO - you fill in here
    private Condition mCond;
    /**
     * Define a count of the number of available permits.
     */
    // TODO - you fill in here
    private SimpleAtomicLong mAtomic;
    private int mPermits;

}
