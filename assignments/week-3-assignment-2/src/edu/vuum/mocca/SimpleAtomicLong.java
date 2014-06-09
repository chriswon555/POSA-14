<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
=======
// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 * 
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong {
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;

<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
=======

    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - add the implementation
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue) {
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
        // TODO -- you fill in here
        mValue = initialValue;
=======
        // TODO - you fill in here
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
        long value;

        // TODO -- you fill in here
        mRWLock.readLock().lock();
        value = mValue;
        mRWLock.readLock().unlock();
        return value;
=======
        // TODO - you fill in here
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically decrements by one the current value
     * 
     * @returns the updated value
     */
    public long decrementAndGet() {
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        mValue--;
        value = mValue;
        mRWLock.writeLock().unlock();
        return value;
=======
        // TODO - you fill in here
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     * 
     * @returns the previous value
     */
    public long getAndIncrement() {
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        value = mValue;
        mValue++;
        mRWLock.writeLock().unlock();
        return value;
=======
        // TODO - you fill in here
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically decrements by one the current value
     * 
     * @returns the previous value
     */
    public long getAndDecrement() {
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        value = mValue;
        mValue--;
        mRWLock.writeLock().unlock();
        return value;
=======
        // TODO - you fill in here
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     * 
     * @returns the updated value
     */
    public long incrementAndGet() {
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
        long value = 0;

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        mValue++;
        mRWLock.writeLock().unlock();
        value = mValue;
        return value;
=======
        // TODO - you fill in here
>>>>>>> upstream/master:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }
}
