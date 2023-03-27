package org.example.leetcode.print_in_order_concurrency_1114;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

    }

}

class Foo {
    public int threadNumber;

    public Foo() {
        this.threadNumber = 1;
    }

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private Semaphore s1 = new Semaphore(0);
    private Semaphore s2 = new Semaphore(0);

    public synchronized void first_2() throws InterruptedException {
        System.out.println("first");
        s1.release();
    }
    public synchronized void second_2() throws InterruptedException {
        s1.acquire();
        System.out.println("seconds");
        s2.release();
    }
    public synchronized void third_2() throws InterruptedException {
        s2.acquire();
        System.out.println("third");
    }



    public synchronized void first_1() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("first");
            threadNumber++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public synchronized void second_1() throws InterruptedException {
        lock.lock();
        try {
            while (threadNumber != 2) {
                condition.await();
            }
            System.out.println("seconds");
            threadNumber++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public synchronized void third_1() throws InterruptedException {
        lock.lock();
        try {
            while (threadNumber != 3) {
                condition.await();
            }
            System.out.println("third");
            threadNumber++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }


    public synchronized void first() throws InterruptedException {
        while (threadNumber != 1) {
            wait();
        }
        System.out.println("first");
        threadNumber++;
        notifyAll();
    }

    public synchronized void second() throws InterruptedException {
        while (threadNumber != 2) {
            wait();
        }
        System.out.println("seconds");
        threadNumber++;
        notifyAll();
    }

    public synchronized void third() throws InterruptedException {
        while (threadNumber != 3) {
            wait();
        }
        System.out.println("third");
        threadNumber++;
        notifyAll();
    }
}
